/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dac Hung
 */
public class main {

   static ArrayList<SinhVienPoly> arr = new ArrayList<SinhVienPoly>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int chon;
        do {            
           menu();
            System.out.println("mời chọn chức năng ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sxtheodiem();
                    break;
                case 4:
                    hocsinhgioi();
                    break;
                case 5: break;
            }
            
        } while (chon<=5);
    }

    public static void menu() {
        System.out.println("mời nhập lựa chọn");
        System.out.println("1. nhập danh sách sinh viên");
        System.out.println("2. xuất danh sách nsinh viên");
        System.out.println("3. xuất danh ssachs học sinh giỏi");
        System.out.println("4. sắp xép sinh viên theo điểm");
        System.out.println("5. thoát");
    }

    public static void nhap() {
        System.out.println("mời nhập số lượng sinh viên ");
        int soluong = sc.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("mời chọn 1 hoặc 2 để thêm "
                    + "1. thêm sinh viên it"
                    + "2. thêm sinh viên biz");
            int chon = sc.nextInt();
            sc.nextLine();
            if (chon == 1) {
                String hoTen;
                double diemJava, diemHTML, diemCSS;
                System.out.println("mời nhập họ tên sinh viên");
                hoTen = sc.nextLine();
                System.out.println("mời nhập java");
                diemJava = sc.nextDouble();
                System.out.println("mời nhập html");
                diemHTML = sc.nextDouble();
                System.out.println("mời nhập diểm css");
                diemCSS = sc.nextDouble();
                SinhVienPoly sv = new SinhVienIT(hoTen, diemJava, diemHTML, diemCSS);
                arr.add(sv);

            } else if (chon == 2) {
                String hoTen;
                double diemMarketing, diemSales;
                System.out.println("mời nhập họ tên sinh viên");
                hoTen = sc.nextLine();
                System.out.println("mời nhập diemMarketing");
                diemMarketing = sc.nextDouble();
                System.out.println("mời nhập diemSales");
                diemSales = sc.nextDouble();
                SinhVienPoly biz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                arr.add(biz);
            } else {
                System.out.println("lựa chọn không hợp lệ");
            }
        }
    }

    public static void xuat() {
        for(SinhVienPoly sv : arr){
            System.out.println(sv.toString());
        }
    }

    public static void hocsinhgioi() {
        for(SinhVienPoly sv : arr){
            if (sv.getHocLuc().equalsIgnoreCase("giỏi")) {
                System.out.println(sv.toString());
            }else{
                System.out.println("không có hs giỏi");
            }
        }
    }

    public static void sxtheodiem() {
        Comparator<SinhVienPoly> com = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return o2.getDiem().compareTo(o1.getDiem());
            }
    
        };
        Collections.sort(arr,com);
        xuat();
    }
}
