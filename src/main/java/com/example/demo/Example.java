package com.example.demo;

import java.util.ArrayList;

public class Example {

    public void fun(int a,int b)
    {
        System.out.println("this");
        System.out.println(a+b);
    }
    public void fun(Integer a,Integer b)
    {
        System.out.println("that");
        System.out.println(a+b);
    }
    public static  void main(String []args)
    {
        Example e=new Example();
        e.fun(6,7);
        /*int arr[]={1,2,3,4};
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
           if(i==arr[i])
               continue;
            System.out.println(arr[i]);
        }*/
    }


}
