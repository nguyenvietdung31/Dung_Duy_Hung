
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
public class ProtocolTester {
    public static void main(String[] args) {  
    // hypertext transfer protocol     
    testProtocol("http://www.adc.org");    
    // secure http  
    testProtocol("https://www.amazon.com/exec/obidos/order2/");  
    // file transfer protocol  
    testProtocol("ftp://metalab.unc.edu/pub/languages/java/javafaq/");
    // Simple Mail Transfer Protocol  
    testProtocol("mailto:elharo@metalab.unc.edu"); 
    // telnet 
    testProtocol("telnet://dibner.poly.edu/"); 
    // local file access 
    testProtocol("file:///etc/passwd"); 
    // gopher  
    testProtocol("gopher://gopher.anc.org.za/"); 
    // Lightweight Directory Access Protocol     
    testProtocol("ldap://ldap.itd.umich.edu/o=University%20of%20Michigan,c=US?postalAd dress");      
    // Jar     
    testProtocol( "jar:http://metalab.unc.edu/java/books/javaio/ioexamples/javaio.jar!");  
    // NFS, Network File System 
    testProtocol("nfs://utopia.poly.edu/usr/tmp/");   
    // a custom protocol for JDBC 
    testProtocol("jdbc:mysql://luna.metalab.unc.edu:3306/NEWS"); 
    // rmi, a custom protocol for remote method invocation     
    testProtocol("rmi://metalab.unc.edu/RenderEngine"); 
    // custom protocols for HotJava     
    testProtocol("doc:/UsersGuide/release.html");     
    testProtocol("netdoc:/UsersGuide/release.html");     
    testProtocol("systemresource://www.adc.org/+/index.html"); 
    testProtocol("verbatim:http://www.adc.org/"); 
}    
  private static void testProtocol(String url) { 
         try {   
      URL u = new URL(url); 
      System.out.println(u.getProtocol(  ) + " is supported"); 
    } 
    catch (MalformedURLException e) { 
      String protocol = url.substring(0, url.indexOf(':')); 
      System.out.println(protocol + " is not supported"); 
    } 
     
  }  
}
