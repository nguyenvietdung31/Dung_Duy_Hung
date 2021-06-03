/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 *
 * @author linhn
 */

public class Server {

	public final static int SERVER_PORT = 7; // Cổng mặc định của Server
	public final static byte[] BUFFER = new byte[4096]; // Vùng đệm chứa dữ liệu cho gói tin nhận

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			System.out.println("Lang nghe cong " + SERVER_PORT + ",   ...");
			ds = new DatagramSocket(SERVER_PORT); // Tạo Socket với cổng là 7
			System.out.println("Khoi dong server ");
			System.out.println("Cho thong diep tu Client ... ");

			while (true) { // Tạo gói tin nhận
				DatagramPacket incoming = new DatagramPacket(BUFFER, BUFFER.length);
				ds.receive(incoming); // Chờ nhận gói tin gởi đến

				// Lấy dữ liệu khỏi gói tin nhận
				String message = new String(incoming.getData(), 0, incoming.getLength());
				System.out.println("Client: " + message);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
	}
}

