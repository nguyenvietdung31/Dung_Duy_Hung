/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_5;

/**
 *
 * @author Dac Hung
 */
public class SinhVienBiz extends SinhVienPoly{
     double diemMarketing,diemSales;
    
    public SinhVienBiz(String hoTen,double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public Double getDiem() {
        return  ((2*this.diemMarketing)+this.diemSales)/3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" + "diemMarketing=" + diemMarketing + ", diemSales=" + diemSales + ", Hoten ="+getHoTen()+ " , Ngành ="+getNganh()+'}';
    }
}
