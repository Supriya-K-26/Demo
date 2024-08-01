package com.example.demo.config;

import java.util.*;

public class ReverseAnArray {

   public static void findThelargestNumber(ArrayList<String> arr)
   {
       Collections.sort(arr, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               String XY= o1 + o2;
               String YX= o2 + o1;
               return XY.compareTo(YX)>0?-1:1;
           }
       });
       Iterator it = arr.iterator();
       while(it.hasNext())
           System.out.print(it.next());
   }

    public static void main(String args[]) {
        int arr[] = {2, 45, 78, 98, 654};
        ArrayList<String> vector=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            vector.add(Integer.toString(arr[i]));
        }
        findThelargestNumber(vector);

    }

}
