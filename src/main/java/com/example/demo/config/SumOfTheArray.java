package com.example.demo.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfTheArray {
    public static int longestSubArray(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int maxLength = 0;
    int sum = 0;

        for(int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if (sum == k)
            maxLength = i + 1;
        else if (map.containsKey(sum - k))
            maxLength = Math.max(maxLength, i - map.get(sum - k));

        if (!map.containsKey(sum))
            map.put(sum, i);
    }

        return maxLength;
}

    public static void matchingIndex(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==i)
            {
                System.out.println(nums[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        /*int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Length of longest sub-array with sum " + k + ": " + longestSubArray(nums, k));*/
           /* Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

            Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
            if(firstNonRepeat.isPresent()) {
                System.out.println("First non repeating:" + firstNonRepeat.get());
            }
            Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
            System.out.println("First repeating:" + firstRepeat.orElse(null));*/
        int nums  [] = {0, 2, 5, 8, 17};
        matchingIndex(nums);
    }
}
