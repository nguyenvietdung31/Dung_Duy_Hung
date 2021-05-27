/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Dac Hung
 */
public class GiangVienThinhGiang extends GiangVien {

    private String coQuanLamViec;

    @Override
    public GiangVien inputq() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao co quan lam viec :");
        coQuanLamViec = sc.nextLine();
        return this;
    }

    @Override
    public void displayq() {
        super.display();
        System.out.println("co quan lam viec :" + coQuanLamViec);
    }

    @Override
    public void tinhluong() {
        float luong;
        luong = this.getSoGioGiang() * 200000;
        this.setTongLuong(luong);
    }
}
