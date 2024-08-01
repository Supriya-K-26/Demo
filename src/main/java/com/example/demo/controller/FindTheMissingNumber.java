package com.example.demo.controller;

import java.util.Arrays;

public class FindTheMissingNumber {

    /*public static void main (String[] args)
    {
        int arr[]={1,2,3,4,5,7,8};
        int missingNumber=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                missingNumber=i+1;
                break;
            }
        }
        System.out.println(missingNumber);
    }*/
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date"};
        Arrays.sort(array, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(Arrays.toString(array));  // Output: [date, apple, cherry, banana]
    }
}
