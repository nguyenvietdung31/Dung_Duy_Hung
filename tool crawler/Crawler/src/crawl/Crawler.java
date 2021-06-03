package crawl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.process.DocumentPreprocessor;

public class Crawler {
	private static Set<String> urls;
	private static Set<String> url_extracted;
	private static Set<String> id_containers;
	private static Set<String> class_containers;
	private static Queue<String> itemCheck = new LinkedList<String>();
	private static String output_folder;
	private static String output_file;
	private static String output_type;
	private static boolean same_domain;
	private static long max_item_check;

	public static void main(String[] args) throws IOException {

		//String configFileName = args[0];
		String configFileName = "E:\\input\\crawl.cfg.txt";
		//String urlExtractedFileName = args[1];
		String urlExtractedFileName = "E:\\input\\url-extracted.vars";
		FileWriter fw = new FileWriter(urlExtractedFileName, true);
		Writer out = null;
		try {
			loadUrlExtracted(urlExtractedFileName);
			loadConfig(configFileName);

			// Validate.isTrue(args.length == 1, "usage: supply url to fetch");
			// String url = args[0];

			// String url = URL;
			// urls.add(url);
			if (output_type.equals("file")) {
				out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output_file, true), "UTF8"));
			}

			while (urls.size() > 0) {
				String urlProcess = (String) urls.iterator().next();
				if (!url_extracted.contains(urlProcess)) {
					if (output_type.equals("file")) {
						parsing(urlProcess, out);
					} else if (output_type.equals("folder")) {
						parsing(urlProcess);
					}
					print("Url: (%s)", urlProcess);
					fw.write(urlProcess + "\n");
					urls.remove(urlProcess);
					url_extracted.add(urlProcess);
				}
			}

			if (output_type.equals("file")) {
				out.close();
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fw.close();
			if (output_type.equals("file")) {
				out.close();
			}
		}

	}

	private static void loadConfig(String configFileName) throws IOException {
		InputStream inputStream = null;
		try {
			Properties prop = new Properties();
			inputStream = new FileInputStream(configFileName);
			prop.load(inputStream);
			String sUrls = prop.getProperty("urls");
			String[] arrUrls = sUrls.split(",");
			urls = new HashSet<String>(Arrays.asList(arrUrls));
			url_extracted.removeAll(Arrays.asList(arrUrls));
			output_type = prop.getProperty("output.type");
			output_folder = prop.getProperty("output.folder");
			output_file = prop.getProperty("output.file");
			same_domain = Boolean.parseBoolean(prop.getProperty("same.domain"));
			max_item_check = Long.parseLong(prop.getProperty("max.item.check"));
			String sIdContainers = prop.getProperty("id.containers");
			String[] arrIdContainers = sIdContainers.split(",");
			id_containers = new HashSet<String>(Arrays.asList(arrIdContainers));
			String sClassContainers = prop.getProperty("class.containers");
			String[] arrClassContainers = sClassContainers.split(",");
			class_containers = new HashSet<String>(Arrays.asList(arrClassContainers));
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}
	}

	private static void loadUrlExtracted(String urlExtractedFileName) throws IOException {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(urlExtractedFileName));
			url_extracted = new HashSet<>();
			while ((sCurrentLine = br.readLine()) != null) {
				url_extracted.add(sCurrentLine);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}

	}

	public static String getDomainName(String url) throws MalformedURLException {
		if (!url.startsWith("http") && !url.startsWith("https")) {
			url = "http://" + url;
		}
		URL netUrl = new URL(url);
		String host = netUrl.getHost();
		if (host.startsWith("www")) {
			host = host.substring("www".length() + 1);
		}
		return host;
	}

	private static void parsing(String url, Writer fw) throws MalformedURLException {
		String domainName = getDomainName(url);
		print("%s", domainName);
		try {
			Document doc = Jsoup.connect(url).get();
			Element elementContainer = null;
			for (String idContainer : id_containers) {
				if (doc.getElementById(idContainer) != null) {
					elementContainer = doc.getElementById(idContainer);
					break;
				}
			}
			for (String classContainer : class_containers) {
				if (doc.getElementsByClass(classContainer).size() > 0) {
					elementContainer = doc.getElementsByClass(classContainer).first();
					break;
				}
			}
			if (elementContainer == null) {
				elementContainer = doc.body();
			}
			Elements paragraphs = elementContainer.select("p");
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String newUrl = link.attr("abs:href");
				if (!same_domain || getDomainName(newUrl).contains(domainName)) {
					if (!url_extracted.contains(newUrl) && !urls.contains(newUrl)
							&& (newUrl.contains(".htm") || newUrl.contains(".html"))) {
						urls.add(newUrl);
					}
				}
			}

			for (Element paragraph : paragraphs) {
				String text = paragraph.text().toLowerCase().trim();
				if (!text.equals("") && !itemCheck.contains(text)) {
					itemCheck.add(text);
					if (itemCheck.size() > max_item_check) {
						itemCheck.remove();
					}
					Reader reader = new StringReader(text);
					DocumentPreprocessor dp = new DocumentPreprocessor(reader);
					for (List<HasWord> sentence : dp) {
						String sentenceString = Sentence.listToString(sentence);
						fw.write(sentenceString + "\n");
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void parsing(String url) {
		try {
			StringBuffer content = new StringBuffer();

			Document doc = Jsoup.connect(url).get();
			Element elementContainer = null;
			for (String idContainer : id_containers) {
				if (doc.getElementById(idContainer) != null) {
					elementContainer = doc.getElementById(idContainer);
					break;
				}
			}
			for (String classContainer : class_containers) {
				if (doc.getElementsByClass(classContainer).size() > 0) {
					elementContainer = doc.getElementsByClass(classContainer).first();
					break;
				}
			}
			if (elementContainer == null) {
				elementContainer = doc.body();
			}
			Elements paragraphs = elementContainer.select("p");
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String newUrl = link.attr("abs:href");
				if (!url_extracted.contains(newUrl) && !urls.contains(newUrl)
						&& (newUrl.contains(".htm") || newUrl.contains(".html"))) {
					urls.add(newUrl);
				}
			}

			for (Element paragraph : paragraphs) {
				String text = paragraph.text().trim();
				if (!text.equals("")) {
					content.append(text);
					content.append('\n');
				}
			}
			String filename = url.substring(7).replace('/', '_').replace('?', '!') + ".txt";
			if (content.length() > 0) {
				if (output_type.equals("folder")) {
					Writer out = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(output_folder + filename), "UTF8"));
					out.write(content.toString());
					out.close();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}
}
