
import java.io.IOException;
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
public class ContentGetter {
    public static void main (String[] args) {
if (args.length > 0) {
//Open the URL for reading
try {
URL u = new URL(args[0]);
try {
Object o = u.getContent( );
System.out.println("I got a " + o.getClass().getName( ));
} // end try
catch (IOException e) {
System.err.println(e);
}
} // end try
catch (MalformedURLException e) {
System.err.println(args[0] + " is not a parseable URL");
}
} 
} 
}
