/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Dac Hung
 */
public class QuanLyChung {
    public static void main(String[] args) {
        int n=0;
        XeMayHoaBinh[] std=null;
        XeMayHaNoi[] stdmark = null;
        do {
         Scanner sc=new Scanner(System.in);
        System.out.println("1 .Nhập thông tin cho n xe máy tại tỉnh Hòa Bình.");
        System.out.println("2 . Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
        System.out.println("3 .Sắp xếp danh sách tăng theo biển số xe. ");
        System.out.println("4 .Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5 . Thống kê số lượng xe đang quản lý.");
        System.out.println("6.  Thoát");
        System.out.println("Nhap vao lua chon cua ban");
        n=Integer.parseInt(sc.nextLine());
        switch (n) {
        case 1:
            int m;
            System.out.println("Nhập số xe máy hòa bình :");
            m=Integer.parseInt(sc.nextLine());
            std=new XeMayHoaBinh[m];
            for (int i = 0; i < m; i++) {
            std[i]=new XeMayHoaBinh();
                std[i].nhap();
            }
            std = new XeMayHoaBinh[m];
            break;
            case 2:
            int p;
            System.out.println("Nhập số xe máy hà nội:");
            p=Integer.parseInt(sc.nextLine());
            stdmark=new XeMayHaNoi[p];
            for (int i = 0; i < p; i++) {
            stdmark[i]=new XeMayHaNoi();
                std[i].nhap();
            }
            std = new XeMayHoaBinh[p];
            break;
           
        }
      }while(n!=2);
    }
}
