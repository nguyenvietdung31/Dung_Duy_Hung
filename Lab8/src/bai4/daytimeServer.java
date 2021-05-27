/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.net.*;
import java.io.*;
import java.util.Date;

/**
 *
 * @author Dac Hung
 */

public class daytimeServer {

    public final static int daytimePort = 13;

    public static void main(String[] args) {
        ServerSocket theServerSocket;
        Socket theConnectionSocket;
        PrintWriter out;
        try {
            theServerSocket = new ServerSocket(daytimePort);
            System.out.println("TimeServer ready at port " + daytimePort);
            try {
                while (true) {
                    theConnectionSocket = theServerSocket.accept();
                    System.out.println("Request arrived!");
                    out = new PrintWriter(theConnectionSocket.getOutputStream(), true);
                    out.println(new Date());
                    theConnectionSocket.close();
                }
            } catch (IOException e) {
                theServerSocket.close();
                InterruptedException(e);
            }
        } catch (IOException e) {
            InterruptedException(e);
        }
    }

    private static void InterruptedException(IOException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
