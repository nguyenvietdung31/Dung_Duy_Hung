/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Dac Hung
 */
public  class XeMay implements IXe{
    String bienso;
    String loaixe;
    String mauxe;
    float giatien;  

    public XeMay() {
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số ");
        bienso = sc.nextLine();
         System.out.println("Nhập loại xe ");
        loaixe = sc.nextLine();
         System.out.println("Nhập màu sắc ");
        mauxe = sc.nextLine();
         System.out.println("Nhập giá tiền  ");
        giatien = sc.nextFloat();
    }

    @Override
    public void hienthi() {
        System.out.println("Biển số "+bienso);
         System.out.println("Loại xe "+loaixe);
          System.out.println("Màu sắc "+mauxe);
           System.out.println("Gía tiền "+giatien);
    }

}
