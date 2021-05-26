/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7Bai6;

import static java.lang.System.out;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author PC
 */
public class Bai6 {
    public static void main(String args[]) throws SocketException {
Enumeration<NetworkInterface> nets=NetworkInterface.getNetworkInterfaces();
for (NetworkInterface netint : Collections.list(nets))
displayInterfaceInformation(netint);
}
static void displayInterfaceInformation(NetworkInterface netint) throws
SocketException {
 out.printf("Display name: %s \n", netint.getDisplayName());
 out.printf("Name: %s\n", netint.getName());
Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
for (InetAddress inetAddress : Collections.list(inetAddresses)) {
out.printf("InetAddress: %s\n", inetAddress);
 }
 out.printf("Up? %s\n", netint.isUp());
 out.printf("Loopback? %s\n", netint.isLoopback());
 out.printf("PointToPoint? %s\n", netint.isPointToPoint());
 out.printf("Supports multicast? %s\n", netint.supportsMulticast());
 out.printf("Virtual? %s\n", netint.isVirtual());
 out.printf("Hardware address:%s\n",Arrays.toString(netint.getHardwareAddress()));
 out.printf("MTU: %s\n", netint.getMTU());
 out.printf("\n");
 }
 }
