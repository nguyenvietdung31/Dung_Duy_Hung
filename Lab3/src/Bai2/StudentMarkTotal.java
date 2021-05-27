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
public class StudentMarkTotal extends StudentMark {

    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal() {
    }

    public StudentMarkTotal(int totalExamSubject, float everageMark, String StuId, String className, String subjectName, int semester, float mark) {
        super(StuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("totalExamSubject" + totalExamSubject);
        System.out.println("everageMark" + everageMark);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("totalExamSubject:");
        totalExamSubject = Integer.parseInt(sc.nextLine());
        System.out.println("everageMark:");
        everageMark = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void setMark(float mark) {
        super.setMark(mark); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getMark() {
        return super.getMark(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSemester(int semester) {
        super.setSemester(semester); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSemester() {
        return super.getSemester(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSubjectName(String subjectName) {
        super.setSubjectName(subjectName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSubjectName() {
        return super.getSubjectName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClassName(String className) {
        super.setClassName(className); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getClassName() {
        return super.getClassName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setStuId(String StuId) {
        super.setStuId(StuId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStuId() {
        return super.getStuId(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTotalExamSubject(StudentMarkTotal[] arr) {
        return arr.length;
    }

    public void calculateEverageMark(StudentMarkTotal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            everageMark += arr[i].getMark();
        }
    }
}
