
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
public class URLEquality {
    public static void main (String[] args) {
try {
URL oreilly = new URL ("http://www.oreilly.com/");
URL ora = new URL("http://www.ora.com/");
if (oreilly.equals(ora)) {
System.out.println(oreilly + " is the same as " + ora);
}
else {
System.out.println(oreilly + " is not the same as " + ora);
}
}
catch (MalformedURLException e) {
System.err.println(e);
}
}
}
