/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author PC
 */
public class Employees {
    protected String MaNV;
    protected String TenNV;
    protected String ChucVu;
    protected double Luong;
    protected double ThoiGianLV;

    public Employees() {
    }

    public Employees(String MaNV, String TenNV, String ChucVu, double Luong, double ThoiGianLV) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
        this.ThoiGianLV = ThoiGianLV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public double getThoiGianLV() {
        return ThoiGianLV;
    }

    public void setThoiGianLV(double ThoiGianLV) {
        this.ThoiGianLV = ThoiGianLV;
    }
     public String toString() {
        return MaNV+"\t"+TenNV+"\t"+ChucVu+"\t"+Luong+"\t"+ThoiGianLV;
    }
}
