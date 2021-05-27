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
import static java.lang.System.in;
public class khachHangViet extends khachHang{
    private int LoaiKH, DinhMuc;
    public khachHangViet(){
        super();
        this.LoaiKH = 0;
        this.DinhMuc = 0;
    }
    public khachHangViet(int ma, double dgia, String ngay, String hoten, int sl, double ttien, int loai, int dmuc){
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.LoaiKH = loai;
        this.DinhMuc = dmuc;
    }
    public int getLoaiKH(){
        return LoaiKH;
    }
    public void setLoaiKH(int loaiKH){
        LoaiKH = loaiKH;
    }
    public int getDinhMuc(){
        return DinhMuc;
    }
    public void setDinhMuc(int dinhMuc){
        DinhMuc = dinhMuc;
    }
    public void nhap()
{
super.nhap();
    System.out.println("loai khach hang(1=SinhHoat,2=KinhDoanh,3=SanXuat)");
    LoaiKH = in.nextInt();
    System.out.println("Dinh Muc: ");
    DinhMuc = in.nextInt();
}
    public double TTien(){
        if(SoLuong <= DinhMuc)
            return this.ThanhTien = this.DonGia * this.SoLuong;
        else
            return this.ThanhTien = this.DinhMuc *this.DonGia + (this.SoLuong - this.DinhMuc) * this.DonGia * 2.5;
    }
    public String toString(){
        String temp;
        if(LoaiKH == 1)
            temp = "SINH HOAT";
        else if(LoaiKH == 2)
            temp = "KINH DOANH";
        else
            temp = "SAN XUAT";
        return" KHACH HANG VIET: " + super.toString() + ", LoaiKH: " + temp 
+ ", Dinh Muc: " + DinhMuc + ", Thanh Tien: " + ThanhTien;
    }
}
