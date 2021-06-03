
import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.Label;
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
public class RelativeURLTest extends Applet {
    public void init ( ) { 
 
 try { 
 URL base = this.getDocumentBase( ); 
 URL relative = new URL(base, "mailinglists.html"); 
 this.setLayout(new GridLayout(2,1)); 
 this.add(new Label(base.toString( ))); 
 this.add(new Label(relative.toString( ))); 
 }catch (MalformedURLException e) { 
 this.add(new Label("This shouldn't happen!")); 
 } 
 }
}
