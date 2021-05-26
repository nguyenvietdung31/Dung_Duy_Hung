/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai12;

/**
 *
 * @author PC
 */
public class Employee {
    String ten, ma, chucVu;
 //Chèn tự động Phương thức tạo không, ba tham số.
 static String StringFormat = "%1$-20s %2$-10s %3$-15s";

    public Employee() {
    }

    public Employee(String ten, String ma, String chucVu) {
        this.ten = ten;
        this.ma = ma;
        this.chucVu = chucVu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public static String getStringFormat() {
        return StringFormat;
    }

    public static void setStringFormat(String StringFormat) {
        Employee.StringFormat = StringFormat;
    }

   
 public String toString()
 {
     return String.format(StringFormat, ten, ma, chucVu);
 }
}
