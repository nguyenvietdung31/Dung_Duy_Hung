
import java.net.URLEncoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class EncodeTest {
    public static void main(String[] args) {
System.out.println(URLEncoder.encode("This string has spaces"));
System.out.println(URLEncoder.encode("This*string*has*asterisks"));
System.out.println(URLEncoder.encode("This%string%has%percent%signs"));
System.out.println(URLEncoder.encode("This+string+has+pluses"));
System.out.println(URLEncoder.encode("This/string/has/slashes"));
System.out.println(URLEncoder.encode("This\string\"has\"quote\"marks"));
System.out.println(URLEncoder.encode("This:string:has:colons"));
System.out.println(URLEncoder.encode("This~string~has~tildes"));
System.out.println(URLEncoder.encode("This(string)has(parentheses)"));
System.out.println(URLEncoder.encode("This.string.has.periods"));
System.out.println(URLEncoder.encode("This=string=has=equals=signs"));
System.out.println(URLEncoder.encode("This&string&has&ampersands"));
}
}
