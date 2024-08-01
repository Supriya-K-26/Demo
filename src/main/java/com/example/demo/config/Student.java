package com.example.demo.config;

import java.util.ArrayList;
import java.util.Collections;

public class Student /*implements
        Comparable<Student>*/{

    private int id;
    private String name;

    public Student(int id, String name ) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Student s1 ){
        if (id == s1.getId()) return 0;
        else if(id>s1.getId()) return 1;
        return -1;
    }

    public static void main(String args[])
    {
        ArrayList<Student> students=new ArrayList<>();
        Student student=new Student(146,"supriya");
        Student student1=new Student(145,"priya");
        Student student2=new Student(140,"chikuu");
        Student student3=new Student(123,"dharshini");
        Student student4=new Student(187,"surya");
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        Collections.sort(students);
        System.out.println(students);

    }*/
}
