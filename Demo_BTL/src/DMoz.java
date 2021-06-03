
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class DMoz {
    public static void main(String[] args) {String target = "";
for (int i = 0; i < args.length; i++) {
target += args[i] + " ";
}
target = target.trim( );
QueryString query = new QueryString("search", target);
try {
URL u = new URL("http://search.dmoz.org/cgi-bin/search?" +query);
InputStream in = new BufferedInputStream(u.openStream( ));
InputStreamReader theHTML = new InputStreamReader(in);
int c;
while ((c = theHTML.read( )) != -1) {
System.out.print((char) c);
}
}
catch (MalformedURLException e) {
System.err.println(e);
}
catch (IOException e) {
System.err.println(e);
}
}
}
