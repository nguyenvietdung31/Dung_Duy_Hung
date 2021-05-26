
package Lab4Bai2;


import java.util.Scanner;
import java.util.Collections;

public class SanPham {
    private String name;
    private double price;

    public SanPham(String name, double price) {
        this.name = name;
        this.price = price;
    }

    SanPham() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm :");
        name = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm :");
        price = sc.nextDouble();
    }
    public void xuatthongtin(){
        System.out.println("Tên sản phẩm "+name+"\t"+"Giá sản phẩm "+price);
    }
}
