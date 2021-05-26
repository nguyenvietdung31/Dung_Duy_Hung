/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Scanner;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author PC
 */
public class HASHMAP {
    public static void main(String[] args) {
        
    int soSanPham =2;
    HashMap<String, String> hashMapProducts = new HashMap<>();
 Scanner Scanner = new Scanner(System.in);
 String maSanPham, tenSanPham;
 // thêm thông tin của 2 sản phẩm vào trong hashMapProducts
 // trong đó key là mã sản phẩm, còn value là tên của sản phẩm đó
 for (int i = 1; i <= soSanPham; i++) {
 System.out.println("Nhập thông tin của sản phẩm thứ " + i);
 System.out.println("Nhập mã sản phẩm: ");
 maSanPham = Scanner.nextLine();
 System.out.println("Nhập tên sản phẩm: ");
 tenSanPham = Scanner.nextLine();
 hashMapProducts.put(maSanPham, tenSanPham);
 }
 // hiển thị danh sách sản phẩm sử dụng Iterator
 System.out.println("Danh sách các sản phẩm vừa nhập: ");
 System.out.println("Mã sản phẩm\tTên sản phẩm");
 Iterator<Map.Entry<String, String>> iterator =
hashMapProducts.entrySet().iterator();
 while (iterator.hasNext()) {
 // tạo 1 entry
 Map.Entry<String, String> entry = iterator.next();
  System.out.println(entry.getKey() + "\t\t" + entry.getValue());
 }
 // thêm 1 sản phẩm mới vào trong hashMapProducts
 System.out.println("Nhập mã sản phẩm cần thêm: ");
 String maSanPhamMoi = Scanner.nextLine();
 if (hashMapProducts.containsKey(maSanPhamMoi)) {
 System.out.println("Mã sản phẩm = " + maSanPhamMoi + " đã tồn tại!");
 } else {
 System.out.println("Nhập tên sản phẩm cần thêm: ");
 String tenSanPhamMoi = Scanner.nextLine();
 hashMapProducts.put(maSanPhamMoi, tenSanPhamMoi);
 soSanPham++;
 System.out.println("Danh sách các sản phẩm sau khi thêm: ");
 System.out.println("Số sản phẩm = " + soSanPham);
 System.out.println("Mã sản phẩm\tTên sản phẩm");
 iterator = hashMapProducts.entrySet().iterator();
 while (iterator.hasNext()) {
 // tạo 1 entry
 Map.Entry<String, String> entry = iterator.next();
 System.out.println(entry.getKey() + "\t\t" + entry.getValue());
 }
}
    }
}