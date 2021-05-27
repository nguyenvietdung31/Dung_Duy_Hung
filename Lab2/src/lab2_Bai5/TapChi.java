/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_Bai5;

/**
 *
 * @author Dac Hung
 */
public class TapChi extends TaiLieu{
        private int soPhatHanh;
    private int thangPhatHanh;
    public TapChi() {
    }
    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public TapChi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public int getSoPhatHanh() {
        return soPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
    public int getThangPhatHanh() {
        return thangPhatHanh;
    }
    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }
    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }
    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
}
