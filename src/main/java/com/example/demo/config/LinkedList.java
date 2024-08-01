package com.example.demo.config;

import org.apache.kafka.common.protocol.types.Field;

public class LinkedList {
    private ListNode head;

    public class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }

    }

    public int lengthOfLinkedList()
    {
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
    }

    public void insertNodeInBeginning()
    {
        ListNode newNode=new ListNode(7);
        newNode.next=head;
        head=newNode;
    }
    public void insertNodeInEnd()
    {
        ListNode newNode=new ListNode(8);
        if(head==null)
        {
            head.next=newNode;
        }
        ListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    public void insertNodeInPosition(int position)
    {
        ListNode newnode=new ListNode(10);
        if(position==1)
        {
            newnode.next=head;
            head=newnode;
        }
        else
        {
            ListNode previous=head;
            int count=1;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=newnode;
            newnode.next=current;
        }
    }
    public ListNode deleteTheFirst()
    {
        if(head==null)
            return null;
       ListNode temp=head;
       head=head.next;
        temp.next=null;
       return temp;
    }
    public ListNode deleteInLast()
    {
        if(head==null)
             return null;
        ListNode current=head;
        ListNode previous=null;
        while(current!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    public ListNode deleteInPosition(int position)
    {
        if(position==1)
        {
            return head;
        }
        int count=1;
        ListNode previous=head;
        while(count<position-1)
        {
            previous=previous.next;
            count++;
        }
        ListNode current=previous.next;
        previous.next=current.next;
        return current;

    }
    public void removeTheKey(int key)
    {
        ListNode current=head;
        ListNode temp=null;
        if(current!=null && current.data==key)
        {
            head=current.next;
            return;
        }
        while (current!=null && current.data!=key)
        {
            temp=current;
            current=current.next;
        }
        if(current==null)return;
        temp.next=current.next;
    }

    public ListNode insertNodeInSortingOrder()
    {
        ListNode newnode=new ListNode(6);
        if (head==null)
            return newnode;
        ListNode temp=null;
        ListNode curent=head;
        while(curent!=null && curent.data < newnode.data)
        {
            temp=head;
            curent=curent.next;
        }
        newnode.next=curent;
        temp.next=newnode;
        return head;
    }
    public void removeDuplicates()
    {
        ListNode current=head;
        while(current!=null && current.next!=null)
        {
            if(head==null)
                 return;
            if(current.data == current.next.data)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
    }
    public boolean searchKey(int key)
    {
        if(head==null)
            return false;
        ListNode current=head;
        while (current!=null)
        {
            if(current.data==key)
                return true;
        }
        current=current.next;
        return false;
    }

    public ListNode reverseTheList()
    {
        if(head == null)
            return head;
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null)
        {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        return prev;
    }
    public ListNode printMiddleNode()
    {
        if(head==null)
            return  head;
        ListNode slowPointer=head;
        ListNode fastPointer=head;
        while (fastPointer!=null && fastPointer.next!=null)
        {
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        return slowPointer;
    }
    public static void main(String args[])
    {
        LinkedList linkedList=new LinkedList();
        linkedList.insertNodeInBeginning();
        linkedList.insertNodeInEnd();
        linkedList.insertNodeInPosition(2);
        linkedList.insertNodeInPosition(1);
        linkedList.display();
        //linkedList.deleteTheFirst();
        //linkedList.display();
        //linkedList.deleteInLast();
        //linkedList.display();
        //linkedList.deleteInPosition(2);
        //linkedList.display();
        //linkedList.removeTheKey(10);
        //linkedList.display();
        //linkedList.insertNodeInSortingOrder();
        //linkedList.display();
        //linkedList.reverseTheList();
        //linkedList.display();
        //linkedList.printMiddleNode();
        //linkedList.display();

    }
}
