package com.example.demo.config;

public class StackWithArray {

    private  int top;
    private  int stack[];

    public StackWithArray(int capacity)
    {
        stack=new int[capacity];
        top=-1;
    }
    public int length()
    {
        return top+1;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public void push(int data)
    {
        if(stack.length==top+1)
        {
            System.out.println("StackV is full");
        }
        top++;
        stack[top]=data;
    }

    public void pop()
    {
            int data=stack[top];
            top--;
            System.out.println(data);
    }

    public static void main(String args[])
    {
        StackWithArray stackWithArray=new StackWithArray(5);
        stackWithArray.push(100);
        stackWithArray.push(200);
        stackWithArray.push(300);
        stackWithArray.push(400);
        stackWithArray.push(500);
        stackWithArray.pop();


    }
}
