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
public class XeMayHaNoi extends XeMay{
    private int n;
    XeMay[] mangxe;
    public XeMayHaNoi(String bienso, String loaixe, String mauxe, 
    float giatien, int n, XeMay[] mangxe) {
    super(bienso, loaixe, mauxe, giatien);
    this.n = n;
    this.mangxe = mangxe;
    }
    public XeMayHaNoi() {
    super();
    }
    public int getN() {
    return n;
    }
    public void setN(int n) {
    this.n = n;
    }
    public XeMay[] getMangxe() {
    return mangxe;
    }
    public void setMangxe(XeMay[] mangxe) {
    this.mangxe = mangxe;
    }


    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so luong xe may o ha noi");
        n=Integer.parseInt(sc.nextLine());
        mangxe=new XeMay[n];
        for(int i=0;i<n;i++) {
        System.out.println("Nhap thong tin xe may thu :"+(i+1));
        mangxe[i]=new XeMay();
        mangxe[i].nhap();
        }
    }

    @Override
    public void hienthi() {
        for(int i=0;i<n;i++) {
        System.out.println("Thong tin xe may thu :"+(i+1)); 
        mangxe[i].hienthi();
    }
  }
}
