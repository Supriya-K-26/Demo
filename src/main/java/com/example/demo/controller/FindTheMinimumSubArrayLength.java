package com.example.demo.controller;
import java.util.*;

public class FindTheMinimumSubArrayLength {
        // function performing calculation
        public static int minLength(ArrayList<Integer> arr) {
            // temporary array equal to given array
            ArrayList<Integer> temp = new ArrayList<Integer>(arr);
            // sorting the temporary array
            Collections.sort(temp);
            // initializing indices
            int s = 0, e = 0;
            // checking the unequal element from start and storing
            // it in s variable
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) != temp.get(i)) {
                    s = i;
                    System.out.println(s);
                    break;
                }
            }
            // checking the unequal element from end and storing it
            // in e variable
            for (int i = arr.size() - 1; i >= 0; i--) {
                if (arr.get(i) != temp.get(i)) {
                    e = i;
                    System.out.println(e);
                    break;
                }
            }
            // returning minimum length
            return (e - s + 1);
        }

        // driver function
        public static void main(String[] args) {
            // given array arr
            ArrayList<Integer> arr = new ArrayList<Integer>(
                    Arrays.asList(10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60)
            );
            // calling the function performing calculation and
            // printing the result
            System.out.println("Minimum length of subarray is : " + minLength(arr));
        }
    }

