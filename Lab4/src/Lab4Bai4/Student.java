/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4Bai4;
import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class Student implements Comparable<Student>{
 private String name;
 private int age;
 private String address;
 public Student() {
 }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
@Override
 public String toString() {
 return "Student@name=" + name + ",age=" + age + ",address=" + address;
 }
 @Override
 public int compareTo(Student student) {
 // sort student's name by ASC
 return this.getName().compareTo(student.getName());
 }
}
