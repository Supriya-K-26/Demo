package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

    public static void main (String [] args)
    {
        TestDemo testDemo=new TestDemo("Supriya",22);
        testDemo.setName("Supriya");
        testDemo.setAge(22);
        TestDemo testDemo1=new TestDemo("Supriya",22);
        testDemo1.setName("Ankit");
        testDemo1.setAge(20);
        TestDemo testDemo2=new TestDemo("Supriya",22);
        testDemo2.setName("AA");
        testDemo2.setAge(20);
        TestDemo testDemo3=new TestDemo("Supriya",22);
        testDemo3.setName("BB");
        testDemo3.setAge(23);
        TestDemo testDemo4=new TestDemo("Supriya",22);
        testDemo4.setName("CC");
        testDemo4.setAge(24);
        List<TestDemo> test=new ArrayList<>();
        test.add(testDemo);
        test.add(testDemo1);
        test.add(testDemo2);
        test.add(testDemo3);
        test.add(testDemo4);
        //System.out.println(test);
        Comparator<TestDemo> testDemoComparator=new Comparator<TestDemo>() {
            @Override
            public int compare(TestDemo o1, TestDemo o2) {
                if(o1.getAge()>o2.getAge())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(test,testDemoComparator);
        for(TestDemo y:test)
        {
            System.out.println(y);
        }
    }

}
