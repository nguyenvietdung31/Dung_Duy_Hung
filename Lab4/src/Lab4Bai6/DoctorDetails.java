/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai6;

/**
 *
 * @author PC
 */
public class DoctorDetails {
 String code;
 String name;
 String specialization;
 int availability;
//Chèn phương thức khởi tạo không tham số và 4 tham số
 @Override
 public String toString()
 {
return "Doctor Code:" +code+"\n"+"Doctor"
        + "Name:"+name+"\n"+"Specialization: " + specialization + "\n" +
"Availability: " + availability;
 }

    DoctorDetails(String code, String name, String specialization, int availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
