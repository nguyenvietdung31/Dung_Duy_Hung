/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author Dac Hung
 */
public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread th = new MyThread();
          th.start();
          System.out.println("This is the main thread");
    }
    public void run(){
   while (true)
 {
 try
 {
 System.out.println("This is the child Thread");
 sleep(1000);
  }
 catch (InterruptedException  ex)
{
 ex.printStackTrace();
 }
 }
 }
}
    
