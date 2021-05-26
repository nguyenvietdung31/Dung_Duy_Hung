/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
         Vali v = (Vali) new Validate();
         Scanner sc = new Scanner(System.in);
        List<Employees> list = new ArrayList<>();
        list.add(new Employees("mv01","Phạm văn tuân","Giam doc",700,8));
        list.add(new Employees("mv02","Phạm Văn Đồng","giám sát",500,2));
        list.add(new Employees("mv03","Trần Quốc Đạt","quản trang",10000,9));
        list.add(new Employees("mv04","Đào văn trường","thư kí",100,2));
        list.add(new Employees("mv05","Nguyễn nhất kì ","nhân viên",300,7));
        list.add(new Employees("mv06","Hoàn ngọc tân ","Giam doc",600,12));
         while (true) {
            int index = 0;
            int choice = 0;
            String name;

            System.out.print("input choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(list);
                    break;
                case 2:
                    v.display(list);
                    break;
                case 3:
                    System.out.print("input remove index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list, index);
                    break;
                case 4:
                    System.out.println("Nhập tên cần tìm ");
                     name = sc.nextLine();
                    v.search(list,name);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
