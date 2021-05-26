/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
 public class Bai2 {
    public static void main(String[] args) {
    int a,b,max,min;
    Scanner sc = new Scanner(System.in); //Phím tắt CTRL + Space
    System.out.println("Nhap so nguyen a:");
    a = sc.nextInt();
    System.out.println("Nhap so nguyen b:");
    b = sc.nextInt();
    max = (a>b)?a:b;
    min = (a>b)?b:a;
    System.out.println("Max la:"+max);
    System.out.println("Min la:"+min);
    }
 }
    
