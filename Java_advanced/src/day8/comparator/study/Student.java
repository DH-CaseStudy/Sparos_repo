package day8.comparator.study;

import java.util.Hashtable;
import java.util.List;

public class Student {
    private String name;
    private String sno;
    private Hashtable<String, Integer> subjectScore;
    private int total;
    private double average;

    public Student(){}

    public Student(String name, String sno, Hashtable subjectScore, int total, double average) {
        this.name = name;
        this.sno = sno;
        this.subjectScore = subjectScore;
        this.total = total;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Hashtable getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(Hashtable subjectScore) {
        this.subjectScore = subjectScore;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", subjectScore=" + subjectScore +
                ", total=" + total +
                ", average=" + average +
                '}' +"\n";
    }
}
