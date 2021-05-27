/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dac Hung
 */
public class MulticastImageReceiver extends JFrame {

    private JLabel picture; // Label to contain image

    public MulticastImageReceiver() {
        super("Multicast Image Receiver"); // Set the window title
        setSize(300, 300); // Set the window size
        picture = new JLabel("No image", SwingConstants.CENTER);
        JScrollPane scrollPane = new JScrollPane(picture);
        getContentPane().add(scrollPane, "Center");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    }

    public JLabel getPicture() {
        return picture;
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2) // Test for correct # of args
        {
            throw new IllegalArgumentException( "Parameter(s): <Multicast Address > <Port>");}
             InetAddress multicastAddress = InetAddress.getByName(args[0]);
        if (!multicastAddress.isMulticastAddress()) {
            throw new IllegalArgumentException("Not a multicast address");
        }
        int port = Integer.parseInt(args[1]);
        MulticastImageReceiver multicastImageReceiver = new MulticastImageReceiver();
        multicastImageReceiver.setVisible(true);
        new Thread(new MulticastImageReceiverThread(multicastImageReceiver, multicastAddress, port, "No Image")).start();
    }
}

