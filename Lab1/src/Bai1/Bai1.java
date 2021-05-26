/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai1 {

 public static void main(String[] args) {
 int a;
 float f;
 double d;
 long l;
 char ch;
 String str;
 Scanner sc = new Scanner(System.in);
 System.out.println("Nhap mot so nguyen:");
 a = sc.nextInt();
 System.out.println("Nhap mot so thuc:");
 f = sc.nextFloat();
 System.out.println("Nhap mot so double:");
 d = sc.nextDouble();
 System.out.println("Nhap mot so long:");
 l = sc.nextLong();
 System.out.println("Nhap mot ki tu:");
 sc.nextLine();
 ch = sc.nextLine().charAt(0);
 System.out.println("Nhap mot chuoi:");
 str = sc.nextLine();
 System.out.println("Du lieu vua nhap:");
 System.out.println("a="+a);
 System.out.println("l="+l);
 System.out.println("f="+f);
 System.out.println("ch="+ch);
 System.out.println("str="+str);
 System.out.println("d="+d);
 System.out.println("\nIn tren cung 1 dong:");
 System.out.println("a="+a+", f="+f+", l="+l+", d="+d+", ch="+ch+",str="+str);
 
 
 }
}
