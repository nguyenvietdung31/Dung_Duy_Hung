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
public class Sach extends TaiLieu{
        private String tenTacGia;
    private String tenSach;
    private int soTrang;
    public Sach() {
    }
    public Sach(String tenTacGia, String tenSach, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }
    public Sach(String tenTacGia, String tenSach, int soTrang, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }
    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public int getSoTrang() {
        return soTrang;
    }
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
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
