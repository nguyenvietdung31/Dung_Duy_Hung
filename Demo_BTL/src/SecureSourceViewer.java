
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Authenticator;
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
public class SecureSourceViewer {
public static void main (String args[]) {
Authenticator.setDefault(new DialogAuthenticator( ));
for (int i = 0; i < args.length; i++) {
try {
//Open the URL for reading
URL u = new URL(args[i]);
InputStream in = u.openStream( );
// buffer the input to increase performancein = new BufferedInputStream(in);
// chain the InputStream to a Reader
Reader r = new InputStreamReader(in);
int c;
while ((c = r.read( )) != -1) {
System.out.print((char) c);
}
}
catch (MalformedURLException e) {
System.err.println(args[0] + " is not a parseable URL");
}
catch (IOException e) {
System.err.println(e);
}
// print a blank line to separate pages
System.out.println( );
} // end for
// Since we used the AWT, we have to explicitly exit.
System.exit(0);
} // end main
} // end SecureSourceViewer
