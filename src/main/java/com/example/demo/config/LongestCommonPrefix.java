package com.example.demo.config;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LongestCommonPrefix {
        public String longestCommonPrefix(String[] S) {
            if (S.length == 0) return "";
            String prefix = S[0];
            for (int i = 1; i < S.length; i++)
                while (S[i].indexOf(prefix) != 0) {
                    System.out.println(S[i].indexOf(prefix));
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            return prefix;
        }
        public static void main(String args[]) {
            // Your code goes here
            LongestCommonPrefix ob = new LongestCommonPrefix();
            String s[] = {"flower", "flow", "flight"};
            System.out.println(ob.longestCommonPrefix(s));
        }
}
