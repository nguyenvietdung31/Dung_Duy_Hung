/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_Bai6.newpackage;

/**
 *
 * @author Dac Hung
 */
import java.util.Scanner;
public class khachHang {
    protected int MaKH, SoLuong;
    protected double DonGia, ThanhTien;
    protected String NgayHD, HoTenKH;
    Scanner in = new Scanner(System.in);
    protected khachHang(){
        this.MaKH = 0;
        this.DonGia = 0;
        this.NgayHD = "";
        this.HoTenKH = "";
        this.SoLuong = 0;
    }
    protected khachHang(int ma, double dgia, String ngay, String hoten, int sl, double ttien ){
        this.MaKH = ma;
        this.DonGia = dgia;
        this.NgayHD = ngay;
        this.HoTenKH = hoten;
        this.SoLuong = sl;
        this.ThanhTien = ttien;
        
    }
    protected int getMaKH(){
        return MaKH;
    }
    protected void setMaKH (int maKH){
        MaKH = maKH;
    }
    protected double getDonGia(){
        return DonGia;
    }
    protected String NgayHD(){
        return NgayHD;
    }
    protected void setNgayHD(String ngayHD){
        NgayHD = ngayHD;
    }
    protected String getHoTenKH() {
        return HoTenKH;
    }
    protected void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }
    protected int getSoLuong() {
        return SoLuong;
    }
    protected void setSoLuong(int sl) {
        SoLuong = sl;
    }
    protected double getThanhTien() {
        return ThanhTien;
    }
    protected void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }
    protected void nhap(){
        System.out.println(" NHAP MA KHACH HANG :");
        MaKH = in.nextInt();
        System.out.println("NHAP HO VA TEN KHACH HANG :");
        HoTenKH = in.next();
        System.out.println("NHAP SO LUONG(KW) : ");
        SoLuong = in.nextInt();
        System.out.println("NHAP DON GIA : ");
        DonGia = in.nextDouble();
        System.out.println("NHAP NGAY LAP HOA DON : ");
        NgayHD = in.next();
    }
    public String toString(){
        return "[ MaKH: \" + MaKH + \", HoTenKH: \" + HoTenKH + \", NgayHD: \" + NgayHD + \", DonGia: \" + DonGia + \", SoLuong: \" +SoLuong ]";
    }
}
