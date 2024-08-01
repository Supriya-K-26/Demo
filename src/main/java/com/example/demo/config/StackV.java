package com.example.demo.config;

import java.util.EmptyStackException;

public class StackV {

    private ListNode top;
    private int length;

    private class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
        }
    }

    public StackV()
    {
        top=null;
        length=0;
    }
    public int length()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length==0;
    }

    public void push(int data)
    {
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }

    public void peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        System.out.println(top.data);
    }

    public static void main(String[]args)
    {
        StackV stackV =new StackV();
        stackV.push(10);
        stackV.push(20);
        stackV.push(30);
        stackV.push(40);
        stackV.push(50);
        stackV.peek();
        stackV.pop();
        stackV.peek();

    }
}
