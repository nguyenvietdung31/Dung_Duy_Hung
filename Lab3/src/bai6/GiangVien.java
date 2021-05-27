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
public abstract class GiangVien {

    private String tenGiangVien;
    private String email;
    private String diachi;
    private String dienThoai;
    private float tongLuong;
    private int soGioGiang;

    public GiangVien() {
    }

    public GiangVien(String tenGiangVien, String email, String diachi, String dienThoai, float tongLuong, int soGioGiang) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.diachi = diachi;
        this.dienThoai = dienThoai;
        this.tongLuong = tongLuong;
        this.soGioGiang = soGioGiang;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }
    
    
    public abstract GiangVien inputq();

    public abstract void displayq();

    public abstract void tinhluong();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten giang vien");
        tenGiangVien = sc.nextLine();
        System.out.println("Nhap email");
        email = sc.nextLine();
        System.out.println("Nhap dia chi");
        diachi = sc.nextLine();
        System.out.println("Nhap dien thoai");
        dienThoai = sc.nextLine();
        System.out.println("So gio giang");
        soGioGiang = sc.nextInt();
    }
    public void display(){
    System.out.println("Ten giang vien:"+tenGiangVien);
    System.out.println("Enail:"+email);
    System.out.println("Dia chi:"+diachi);
    System.out.println("Dien thoai:"+dienThoai);
    System.out.println("Tong luong:"+tongLuong);
    System.out.println("So gio giang:"+soGioGiang);
 }
}
