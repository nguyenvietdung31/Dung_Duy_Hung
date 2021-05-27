/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Dac Hung
 */
public class StudentMark implements Imark{
    private String StuId;
private String className;
private String subjectName;
private int semester;
private float mark;

    public StudentMark() {
    }

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
       Scanner sc = new Scanner(System.in);
        System.out.println("StuId:");
        StuId=sc.nextLine();
        System.out.println("className:");
        className=sc.nextLine();
        System.out.println("subjectName:");
        subjectName=sc.nextLine();
        System.out.println("semeter:");
        semester=Integer.parseInt(sc.nextLine());
        System.out.println("mark:");
        mark=Float.parseFloat(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("StuId"+StuId);
        System.out.println("className"+className);
        System.out.println("subjectName"+subjectName);
        System.out.println("semeter"+semester);
        System.out.println("mark"+mark);
    }

}
