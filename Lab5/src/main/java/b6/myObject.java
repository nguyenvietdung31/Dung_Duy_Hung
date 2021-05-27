/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Calendar;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author Dac Hung
 */
public class myObject {
 boolean flag = false;
 DateFormat df;
 int second;
 public synchronized void thoiGian() {
 while (flag) {
 try {
 wait();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 df = new SimpleDateFormat("HH:mm:ss");
String format = df.format(new Date());

 System.out.println(format);
 second = Calendar.getInstance().get(Calendar.SECOND);
 flag = true;
 notifyAll();
 }
 public synchronized void kiemtra() {
 while (!flag) {
 try {
 wait();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 if(second % 2 ==0 )
     System.out.println("The "+ second +" is Even");
 else
 System.out.println("The "+ second +" is Odd");
 flag = false;
 notifyAll();
 }}