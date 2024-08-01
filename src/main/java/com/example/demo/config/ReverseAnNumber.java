package com.example.demo.config;

public class ReverseAnNumber {
        public static int reverse(int num) {
            int reversed = 0;
            int sign = 1;

            // Handle negative numbers
            if (num < 0) {
                sign = -1;
                num = -num;
                System.out.println(num);
            }

            while (num != 0) {
                int digit = num % 10;  // Extract the last digit
                System.out.println(digit);
                reversed = reversed * 10 + digit;  // Build the reversed number
                System.out.println(reversed);
                num /= 10;  // Remove the last digit from the original number
                System.out.println(num);
            }
            return sign * reversed;
        }

        public static void main(String[] args) {
            int num1 = 1234;
            int num2 = -5678;
            int num3 = 1000;

            System.out.println("Reversed 1234: " + reverse(num1));  // Output: 4321
            System.out.println("Reversed -5678: " + reverse(num2));  // Output: -8765
            System.out.println("Reversed 1000: " + reverse(num3));  // Output: 1
        }
    }
