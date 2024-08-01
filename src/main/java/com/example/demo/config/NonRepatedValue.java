package com.example.demo.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepatedValue {

    /*public static void main(String args[])
    {
        String Value="lullaby";
        Map<Character,Integer> arr=new HashMap<>();
        for(int i=0;i<Value.length();i++)
        {
            char c=Value.charAt(i);
            arr.put(c,arr.getOrDefault(c,0)+1);
        }
        for(Character c:Value.toCharArray())
        {
            if(arr.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }*/
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Functional", "Interface");
        Function<String, Integer> wordLength = String::length;
        List<Integer> lengths = words.stream().map(wordLength).collect(Collectors.toList());
        System.out.println(lengths);
    }
}
