/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.StringTokenizer;
import javax.swing.JTextArea;

/**
 *
 * @author linhn
 */
public class UDPServer_Thread extends Thread {

    DatagramSocket mServerSocket;
    JTextArea mTxaStatus; //JTextArea lưu status của server

    public UDPServer_Thread(JTextArea txaStatus) {//hàm tạo UDPS-T 
        mTxaStatus = txaStatus;
    }

    @Override
    public void run() {
        int port = 21;
        try {
            mServerSocket = new DatagramSocket(port);//tạo đối tượng datagram Socket với cổng 21
            mTxaStatus.append("Server khởi động ở port: " + port + "\nĐang đợi dữ liệu\n");//in ra " " ở txastatus server
            byte[] buf = new byte[2048];// bộ nhớ đệm 
            DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);// khai báo gói tin nhận 
            while (true) {
                try {
                    mServerSocket.receive(receivePacket);// nhận gói tin bằng phương thức receive
                    String ClientMsg = new String(receivePacket.getData(), 0,receivePacket.getLength());//đổi thông điệp sang string
                    StringTokenizer st = new StringTokenizer(ClientMsg, " ");//đếm số từ dựa vào dấu space
                    int numOfWords = st.countTokens(); 
                    //in ra thông điệp, kết quả 
                    String returnMsg = "Dữ liệu gôc : " + ClientMsg + "\n"
                            + "Dữ liệu đã xử lý:\n" + ClientMsg.toUpperCase() + "\n"
                            + ClientMsg.toLowerCase() + "\n" + "Số từ: " + numOfWords + "\n\n";
                    mTxaStatus.append(returnMsg);
                    //gói tin gửi outpacket
                    DatagramPacket outPacket = new DatagramPacket(returnMsg.getBytes(),
                            returnMsg.getBytes().length, receivePacket.getAddress(),
                            receivePacket.getPort());
                    //gửi gói tin outpacket
                    mServerSocket.send(outPacket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void StopServer() {
        super.stop();
        mServerSocket.close();//đóng socket ,giải phóng tài nguyên
    }
}
