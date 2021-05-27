/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba2_Bai7;

/**
 *
 * @author Dac Hung
 */
public class Employee extends Person{
        private double hesoLuong;
    private String danhgia;

    public Employee() {
    }

    public Employee(double hesoLuong, String danhgia, String hoten, String diachi) {
        super(hoten, diachi);
        this.hesoLuong = hesoLuong;
        this.danhgia = danhgia;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

public double TinhLuong(){
    return this.hesoLuong *12000;
}

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDiachi(String diachi) {
        super.setDiachi(diachi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDiachi() {
        return super.getDiachi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHoten(String hoten) {
        super.setHoten(hoten); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHoten() {
        return super.getHoten(); //To change body of generated methods, choose Tools | Templates.
    }
}
