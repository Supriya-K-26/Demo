package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

    @FunctionalInterface
    public  interface Payment{
         abstract String getPaymentMethod(String value);
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        String val="Supriya";
        val=val+"name";
        name.add("Supriya");
        name.add("Happy");
        name.add("always");
        name.stream().filter(value->value.equals("Happy")).forEach(value-> System.out.println(value));
    }
}
