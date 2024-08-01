package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestDemo /*implements Comparable<TestDemo>*/ {

    private String name;
    private int age;

    public TestDemo(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "TestDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(TestDemo t) {
        if(this.getAge()>t.getAge())
            return 1;
        else
            return -1;
    }*/
}
