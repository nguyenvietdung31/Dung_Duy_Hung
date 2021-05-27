/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5Bai4;

import java.util.Random;

/**
 *
 * @author PC
 */
public class ThreadTest {
    public static int[] mang = new int[1000];
    public static void gan()
        {
            for(int i =0; i<mang.length;i++)
                {
                    int Random= new Random().nextInt(1000);
                    mang[i]=Random;
                }
        }
        public static void main(String[] args)
        {
            gan();
            ThreadUtils tu1 = new ThreadUtils(0,500,mang);
            Thread t1 = new Thread((Runnable) tu1);
            t1.start();
            try {
            t1.join();
            } catch(InterruptedException ex)
                {
                }
        long tong1 = tu1.getSum();
        ThreadUtils tu2 = new ThreadUtils(501, 999,mang);
        Thread t2 = new Thread((Runnable) tu2);
        t2.start();
        try {
                t2.join();
            } catch(InterruptedException ex)
            {
            }
    long tong2 = tu2.getSum();
    System.out.println("Tong mang 1: " + tong1);
    System.out.println("Tong mang 2: " + tong2);
    System.out.println("Tong hai gia tri: " + tong1 + tong2);
 }
}
