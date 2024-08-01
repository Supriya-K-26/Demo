package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDev {

    public static void main(String args[]) {
        int arr[] = {6, 2, 4, 10};
        List<Integer> pairs=new ArrayList<>();
        Arrays.sort(arr);
        int abosoluteDifference=99999999;
        for(int i = 0;i<arr.length-1;i++)
        {
            int difference=arr[i+1]-arr[i];
            //System.out.println(difference);
            //System.out.println(arr[i+1]);
            //System.out.println(arr[i]);
            if(difference<=abosoluteDifference)
            {
                pairs.add(arr[i]);
                pairs.add(arr[i + 1]);
                abosoluteDifference=difference;
            }
        }
        //System.out.println(pairs);
        for(int value:pairs)
        {
            System.out.println(value);
        }
    }
}

