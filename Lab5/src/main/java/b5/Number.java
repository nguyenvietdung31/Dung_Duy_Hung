/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5;

/**
 *
 * @author Dac Hung
 */
public class Number {
 private int num = 1;
 private boolean flag = false;
 public synchronized void inSo(){
 while (flag) {
 try {
 wait();
 } catch (Exception e) {
 }
 }
 System.out.println("So: " + num);
 flag = true;
 notifyAll();
 }
 public synchronized void kiemtra(){
 while (!flag) {
 try {
 wait();
} catch (Exception e) {
 }
 }
 if (laSoNgTo())
 System.out.println(num+ " la so nguyen to.");
 else
 System.out.println(num+ " khong phai la so nguyen to.");
 num++;
 flag = false;
 notifyAll();
 }
 private boolean laSoNgTo() {
 if (num == 1) return false;
 for (int i= 2; i < num; i++) {
 if (num % i == 0)
 return false;
 }
 return true;
 }
}