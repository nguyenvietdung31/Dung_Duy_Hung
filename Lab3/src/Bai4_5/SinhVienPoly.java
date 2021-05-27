/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_5;

import java.util.Scanner;

/**
 *
 * @author Dac Hung
 */
public  class SinhVienPoly {
    private String hoTen;
    private String nganh;
    private float Diem;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh, float Diem) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.Diem =  Diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem =  Diem;
    }
   @Override
   public String toString(){
       return "Sinhvien{" + "ten=" +hoTen+", diem = "+Diem+'}';
   }
     public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ten: ");
    hoTen = sc.nextLine();
    System.out.println("Nhap nganh: "); 
    nganh= sc.nextLine();
    System.out.println("Nhap diem: ");
    Diem= (float) sc.nextDouble();
        
}
    public void xuat(){
    System.out.println(" Ten: "+ hoTen);
    System.out.println(" Nganh: "+ nganh); 
    System.out.println(" Diem: "+ Diem);
    
  
}
    public String Hocluc(){
    if(Diem<5)
    {return"Hoc luc Yeu!";}
    if(Diem>=5 && Diem <=7)
    { return "Hoc luc Trung Binh!";}
    if(Diem>7 && Diem<8)
    { return "Hoc luc Kha!";}
    if(Diem>8)
    { return "Hoc luc Gioi!";}
    return "Nhap sai!";
    }

    void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
