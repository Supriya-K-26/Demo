package com.example.demo.config;

import java.util.Arrays;
import java.util.Stack;

public class FirstGreatestElementusingStack {

    public int[] nextGreatestElemnet(int arr[])
    {
        Stack<Integer> stack =new Stack<>();
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!stack.empty())
            {
                while(!stack.empty() && stack.peek()<=arr[i])
                {
                    stack.pop();
                }
            }
            if(stack.empty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
       return res;
    }

    public static void main(String[]args)
    {
        int arr[]={4,7,3,4,8,1};
        FirstGreatestElementusingStack firstGreatestElementusingStack=new FirstGreatestElementusingStack();
        int res[]=firstGreatestElementusingStack.nextGreatestElemnet(arr);
        System.out.println(Arrays.asList(res));
    }

}
