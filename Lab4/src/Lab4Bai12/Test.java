/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai12;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        EmployeeDetail employeeDetail = new EmployeeDetail();
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("Hùng", "EP1", "Quản lý"));
        listEmployee.add(new Employee("An", "EP2", "Thư ký"));
        employeeDetail.printCollection(listEmployee);
        ArrayList<Employee> listHREmployee = new ArrayList<>();
        listHREmployee.add(new HREmployee("Ban cố vấn", "B1", "Lượng",
       "EP3", "Quản lý"));
        listHREmployee.add(new HREmployee("Ban tuyên giáo", "B2",
       "Trang", "EP4", "Quản lý"));
        employeeDetail.printDerivedCollection(listHREmployee);
    }
}
