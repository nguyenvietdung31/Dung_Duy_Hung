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
public class Customer extends Person{
        private String tenCty;
    private double tgHDon;

    public Customer() {
    }

    public Customer(String tenCty, double tgHDon, String hoten, String diachi) {
        super(hoten, diachi);
        this.tenCty = tenCty;
        this.tgHDon = tgHDon;
    }

    public String getTenCty() {
        return tenCty;
    }

    public void setTenCty(String tenCty) {
        this.tenCty = tenCty;
    }

    public double getTgHDon() {
        return tgHDon;
    }

    public void setTgHDon(double tgHDon) {
        this.tgHDon = tgHDon;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
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
