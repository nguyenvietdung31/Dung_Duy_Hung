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
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import ba2_Bai7.Employee;
import ba2_Bai7.Person;
public class QuanLy {
      private ArrayList<Person> persons;
     private Scanner sc;
     public QuanLy() {
     persons = new ArrayList<>();
     sc = new Scanner(System.in);
    }
      public Student addStudent(){
     Student s = new Student();
     System.out.println("Nhập họ tên: ");
     s.setHoten(sc.nextLine());
     System.out.println("Nhập địa chỉ: ");
    s.setDiachi(sc.nextLine());
     System.out.println("Điểm môn 1 : ");
     s.setMh1(Double.parseDouble(sc.nextLine()));
     System.out.println("Điểm môn 2: ");
     s.setMh2(Double.parseDouble(sc.nextLine()));
     System.out.println("Đánh giá : ");
     s.setDanhgia(sc.nextLine());
     return s;
     }
      public Customer addCustomer(){
          Customer s = new Customer();
          System.out.println("Nhập họ tên: ");
            s.setHoten(sc.nextLine());
            System.out.println("Nhập địa chỉ: ");
           s.setDiachi(sc.nextLine());
          System.out.println("Tên công ty:");
          s.setTenCty(sc.nextLine());
          System.out.println("Trị giá hóa đơn:");
           s.setTgHDon(Double.parseDouble(sc.nextLine()));
          return s;
      }
      public Employee addEmployee(){
          Employee s =Employee();
          System.out.println("Nhập họ tên: ");
            s.setHoten(sc.nextLine());
            System.out.println("Nhập địa chỉ: ");
           s.setDiachi(sc.nextLine());
           System.out.println("Nhập hệ số lương :");
           s.setHesoLuong(Double.parseDouble(sc.nextLine()));
           System.out.println("Nhập đánh giá :");
           s.setDanhgia(sc.nextLine());
          return s;
      }
      
          public void nhapDanhSachNguoiDung(){
     System.out.println("Nhập 1 - Tạo mới sinh viên");
     System.out.println("Nhập 2 - Tạo mới nhân viên");
     System.out.println("Nhập 3 - Tạo mới khách hàng");
     System.out.println("Nhập 4 - Kết thúc");
     int selectedValue;
     do {
     System.out.println("Bạn chọn: ");
     selectedValue = Integer.parseInt(sc.nextLine());
     switch(selectedValue){
     case 1:
     persons.add(addStudent());
     break;
     case 2:
     persons.add(addEmployee());
     break;
     case 3:
     persons.add(addCustomer());
     break;
     }
    } while (selectedValue!=4);
    }
     private void xuatThongTin(Person person){
     System.out.println("Họ tên " + person.getHoten());
     System.out.println("Địa chỉ "+ person.getDiachi());
     if (person instanceof Student) {
     Student student = (Student) person;
     System.out.println("Điểm môn 1 : " + student.getMh1());
     System.out.println("Điểm môn 2 : " + student.getMh1());
     System.out.println("Điểm trung bình: " + student.tong());
     System.out.println("Đánh giá : " + student.getDanhgia());
     }
     else{
     if (person instanceof Employee) {
     Employee  employee = (Employee) person;
    System.out.println("Hệ số lương : " + employee.getHesoLuong());
    System.out.println("Tổng lương : " + employee.TinhLuong());
    System.out.println("Đánh giá :" + employee.getDanhgia());
     }else{
     Customer customer = (Customer)person;
     System.out.println("Tên công ty: " + customer.getTenCty());
    System.out.println("Gía trị hóa đơn :" + customer.getTgHDon());
     }
     }
     }
     public void xuatDanhSachNguoiDung(){
     for (Person person : persons) {
     xuatThongTin(person);
     }
     }
      

    private Employee Employee() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
      public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     QuanLy QuanLy = new QuanLy();
     QuanLy.nhapDanhSachNguoiDung();
     QuanLy.xuatDanhSachNguoiDung();
     }
}
