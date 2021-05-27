/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.*;
import java.net.Socket;

public class ConnectHttpUsingSocket {

    public static void main(String[] args) throws Exception {
        //Kết nối
        Socket socket = new Socket("localhost", 80);
        //Gửi yêu cầu 
        OutputStream os = socket.getOutputStream();
        PrintWriter out = new PrintWriter(os, true);
        out.println("GET / HTTP/1.0");
        out.println();
        out.flush();
        //Nhận dữ liệu
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] buffer = new byte[4086];
        while ((len = is.read(buffer)) != -1) {
            String data = new String(buffer, 0, len);
            System.out.println(data);
        }
        socket.close();
    }
}
