/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai3;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validate implements Vali{

    @Override
    public void add(List<Employees> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên ");
        String MaNV = sc.nextLine();
        System.out.println("Nhập tên nhân viên ");
        String TenNV = sc.nextLine();
        System.out.println("Nhập chức vụ");
        String ChucVu = sc.nextLine();
        System.out.println("Nhập lương nhân viên ");
        double Luong = Double.parseDouble(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhập thời gian làm việc ");
        double ThoiGianLV = Double.parseDouble(sc.nextLine());
        Employees s =new Employees(MaNV,TenNV,ChucVu,Luong,ThoiGianLV);
        list.add(s);
    }

    @Override
    public void display(List<Employees> list) {
          for (Employees o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void remove(List<Employees> list, int i) {
         for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                list.remove(j);
                break;
            }
        }
    }

    public void search(List<Employees> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTenNV().equals(name)){
               System.out.println("có tên bạn cần tìm ");
            }
        }
    }

}
