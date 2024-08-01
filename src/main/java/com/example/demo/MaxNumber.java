package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxNumber {

    public static int maxElementInArray(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void reverseAString(String value)
    {
        for(int i=value.length()-1;i>=0;i--)
        {
            System.out.print(value.charAt(i));
        }

    }

    public static void countTheCharacters(String value)
    {

        Map<Character, Long> result= value.chars().mapToObj(c->(char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }

    public static  void main(String[]args) {
        int arr[] = {7, 9, 10, 65, 25};
        int maxElemnet=maxElementInArray(arr);
        System.out.println(maxElemnet);
        reverseAString("Happy");
        countTheCharacters("DREAMLOVE");
    }
}
