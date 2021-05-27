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
public class Person {
      private String hoten;
    private String diachi;

    public Person() {
    }

    public Person(String hoten, String diachi) {
        this.hoten = hoten;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", diachi=" + diachi + '}';
    }
    
}
