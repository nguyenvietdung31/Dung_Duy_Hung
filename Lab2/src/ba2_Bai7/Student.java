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
public class Student extends Person{
        private double mh1;
    private double mh2;
    private String danhgia;

    public Student() {
    }

    public Student(double mh1, double mh2, String danhgia, String hoten, String diachi) {
        super(hoten, diachi);
        this.mh1 = mh1;
        this.mh2 = mh2;
        this.danhgia = danhgia;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getMh1() {
        return mh1;
    }

    public void setMh1(double mh1) {
        this.mh1 = mh1;
    }

    public double getMh2() {
        return mh2;
    }

    public void setMh2(double mh2) {
        this.mh2 = mh2;
    }
    public double tong(){
        return (this.mh1 + this.mh2)/2;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    @Override
    public void setDiachi(String diachi) {
        super.setDiachi(diachi); 
    }

    @Override
    public String getDiachi() {
        return super.getDiachi(); 
    }

    @Override
    public void setHoten(String hoten) {
        super.setHoten(hoten);
    }

    @Override
    public String getHoten() {
        return super.getHoten(); 
    }
}
