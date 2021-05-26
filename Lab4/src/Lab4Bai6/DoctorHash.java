/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DoctorHash {
    static HashMap<String, DoctorDetails> elements;
 public DoctorHash()
 {
 elements = new HashMap<>();
 }
 public void Add()
 {
 Scanner Scanner = new Scanner(System.in);
 String code, name, specialization;
 int availability;
 System.out.print("Nhập code: ");
 code = Scanner.nextLine();
 System.out.print("Nhập tên: ");
 name = Scanner.nextLine();
 System.out.print("Nhập chuyên môn: ");
 specialization = Scanner.nextLine();
 availability = InputNumberFormat("Nhập giờ làm việc: ");
DoctorDetails doctorDetails = new DoctorDetails(code, name,
specialization, availability);
 elements.put(doctorDetails.code, doctorDetails);
 }
  public void Search()
 {
 Scanner Scanner = new Scanner(System.in);
 System.out.print("Nhập code cần tìm: ");
 String code = Scanner.nextLine();
 if(elements.containsKey(code)==false)
 {
 System.out.println("Không tìm thấy dữ liệu!");
 }else
 {
 System.out.println("Thông tin bác sỹ tìm thấy:");
 System.out.println(elements.get(code).toString());
 }
 }
 public void ShowAll()
 {
 System.out.println("*******Thông tin tất cả bác sỹ***********");
 Iterator it = elements.entrySet().iterator();
 int index = 1;
 while(it.hasNext())
 {
 System.out.println("Bác sỹ " + index);
 HashMap.Entry entry = (HashMap.Entry)it.next();
System.out.println(entry.getValue().toString() + "\n");
 index++;
 }
 }

    private int InputNumberFormat(String nhập_giờ_làm_việc_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}