/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1; 

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;

/**
 *
 * @author linhn
 */


public class Client {

	public final static String SERVER_IP = "127.0.0.1";
	public final static int SERVER_PORT = 7; // Cổng mặc định của Server
	public final static byte[] BUFFER = new byte[4096]; // Vùng đệm chứa dữ liệu cho gói tin nhận

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(); // Tạo DatagramSocket
			System.out.println("Khoi dong Client ");

			InetAddress server = InetAddress.getByName(SERVER_IP);
			while (true) {
				System.out.println("Nhap thong diep: ");
				InputStreamReader isr = new InputStreamReader(System.in); // Nhập
				BufferedReader br = new BufferedReader(isr); // một chuỗi
				String theString = br.readLine(); // từ bàn phím
				byte[] data = theString.getBytes(); // Đổi chuỗi ra mảng bytes

				// Tạo gói tin gởi
				DatagramPacket dp = new DatagramPacket(data, data.length, server, SERVER_PORT);
				ds.send(dp); // Send gói tin sang Server

			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
	}
}

