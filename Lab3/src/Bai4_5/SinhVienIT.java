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
public class SinhVienIT extends SinhVienPoly{
    double diemJava,diemHTML,diemCSS;


    public SinhVienIT( String hoTen,double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, "it");
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    
    public SinhVienIT() {
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }

    @Override
    public Double getDiem() {
        return ((2*this.diemJava)+this.diemHTML+this.diemCSS)/4;
    }

    @Override
    public String toString() {
        return "sinhVienIT{" + "diemJava=" + diemJava + ", diemHTML=" + diemHTML + ", diemCSS=" + diemCSS + ",hoTen = "+getHoTen()+'}';
    }

 
}
