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
public class TreeSetExample2 {
    public static void main(String[] args){
    // init treeSet
 TreeSet<Student> treeSet = new TreeSet<Student>();
 // create students object
 Student student1 = new Student("Cong", 17, "Hanoi");
 Student student2 = new Student("Dung", 16, "Haiphong");
 Student student3 = new Student("Ngon", 18, "Hanoi");
 Student student4 = new Student("Hanh", 19, "Danang");
 // add students object to treeSet
 treeSet.add(student1);
 treeSet.add(student2);
 treeSet.add(student3);
 treeSet.add(student4);
 treeSet.add(student1);
 // show treeSet
 for (Student student : treeSet) {
 System.out.println(student.toString());
 }
    }
}
