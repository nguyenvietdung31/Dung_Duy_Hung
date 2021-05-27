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
public class khachHangNuocNgoai extends khachHang{
    private String QuocTich;
    public khachHangNuocNgoai(){
        super();
        this.QuocTich="";
    }
    public khachHangNuocNgoai(int ma, double dgia, String ngay, String hoten, int sl, double ttien, String qt) {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.QuocTich = qt ;
    }
    public String getQuocTich(){
        return QuocTich;
    }
    public void setQuocTich(String quocTich){
        QuocTich = quocTich;
    }
    public void nhap(){
        super.nhap();
        System.out.println(" QUOC TICH :");
        QuocTich = in.nextLine();
    }
    public double TTien(){
        return this.ThanhTien = this.SoLuong * this.DonGia;
    }
    public String toString(){
        return"KHACH HANG NUOC NGOAI : " + super.toString() + ", QuocTich: " + 
QuocTich
+ ", ThanhTien: " + ThanhTien;
    }
}
