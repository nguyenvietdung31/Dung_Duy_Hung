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
public class GiangVienCoHuu extends GiangVien {

    private float luongThoaThuan;
    private int soGioQuyDinh = 40;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(float luongThoaThuan, int soGioQuyDinh) {
        this.luongThoaThuan = luongThoaThuan;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public GiangVienCoHuu(float luongThoaThuan, int soGioQuyDinh,
            String tenGiangVien, String email, String diachi, String dienThoai, float tongLuong, int soGioGiang) {
        super(tenGiangVien, email, diachi, dienThoai, tongLuong, soGioGiang);
        this.luongThoaThuan = luongThoaThuan;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    @Override
    public GiangVien inputq() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong thoa thuan:");
        this.luongThoaThuan = Float.parseFloat(sc.nextLine());
        return this;
    }

    @Override
    public void displayq() {
        super.display();
        System.out.println("luong thoa thuan :" + luongThoaThuan);
        System.out.println("so gio quy dinh :" + soGioQuyDinh);
    }

    @Override
    public void tinhluong() {
        float luong;
        luong = luongThoaThuan + (this.getSoGioGiang() - 40) * 200000;
        this.setTongLuong(luong);
    }
}

