
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.TextArea;
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
public class ProtocolTesterApplet extends Applet {
    TextArea results = new TextArea( );
public void init( ) { 
this.setLayout(new BorderLayout( )); 
this.add("Center", results);
} 
public void start( ) 
{ 
String host = "www.peacefire.org";
String file = "/bypass/SurfWatch/"; 
String[] schemes = {"http", "https", "ftp", "mailto", 
                    "telnet", "file", "ldap", "gopher", 
                    "jdbc", "rmi", "jndi", "jar", 
                    "doc", "netdoc", "nfs", "verbatim", 
                    "finger", "daytime", "systemresource"};
for (int i = 0; i < schemes.length; i++) {
try {
URL u = new URL(schemes[ i ], host, file); 
results.append(schemes[i] + " is supported\r\n");
} 
catch (MalformedURLException e) { 
	results.append(schemes[i] + " is not supported\r\n"); 
} 
} 
} 

}
