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
public class TaiLieu {
    String maTaiLieu;
    String tenNhaXuatBan;
    int soBanPhatHanh;
    public TaiLieu() {
    }
    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
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
