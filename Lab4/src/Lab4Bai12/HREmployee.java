/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai12;

/**
 *
 * @author PC
 */

public class HREmployee extends Employee
{
 String tenPhongBan, maPhongBan;

    public HREmployee(String hung, String eP1, String ql) {
        super(hung, eP1, ql);
    }

    public HREmployee(String tenPhongBan, String maPhongBan, String hung, String eP1, String ql) {
        super(hung, eP1, ql);
        this.tenPhongBan = tenPhongBan;
        this.maPhongBan = maPhongBan;
    }
    

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public static String getStringFormat() {
        return StringFormat;
    }

    public static void setStringFormat(String StringFormat) {
        HREmployee.StringFormat = StringFormat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
 static String StringFormat = "%1$-20s %2$-10s";
 public String toString()
 {
 return super.toString() + String.format(StringFormat, tenPhongBan, 
maPhongBan);
 }
}