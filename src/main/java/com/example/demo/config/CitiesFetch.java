package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

public class CitiesFetch {

    public static void main(String args[]) {
        List<String> cities = new ArrayList<>();
        cities.add("Bangalore");
        cities.add("mumbai");
        cities.add("chennai");
        cities.add("madurai");
        //cities.stream().filter(cit -> cit.contains("Bangalore")).map(res->res==);
        String isCityAvailbale  =cities.stream().map(city ->
        {
            if(city.contains("Bangalore"))
            {
                return "YES the CITY IS AVAILABLE";
            }
            return "NOT AVAILABLE";
        }).toString();
        System.out.println(isCityAvailbale);

    }

}
