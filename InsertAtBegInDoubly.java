import java.util.*;
public class Main {  
     class Node{  
        int data;  
        Node next;  
        Node prev;
  
       Node(int val) {  
            data = val;  
           next = null;  
        }  
    }  
   Node head = null;  
   Node tail = null;  
     
     public void atEnd(int data) {  
         Node newNode = new Node(data);
          if(head == null) {  
              head = newNode;  
            tail = newNode;  
        }  
        else {  
              tail.next = newNode;
              newNode.prev=tail;
            tail = newNode;  
        }  
    }  
    public void InsertAtBeg(int value)
    {
        Node v=new Node(value);
        head.prev=v;
        v.next=head;
        head=v;
    
    }
    public void display() {  
         Node current = head;  
        if(head == null) {  
            System.out.println("Empty List");  
            return;  
        }  
         System.out.println("The list is:- ");
        while(current != null) {  
             System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        Main list = new Main();  
    list.atEnd(55); 
   list.atEnd(26);   
   list.atEnd(45);  
        list.display(); 
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the element you want to add at the begining:- ");
        int x=obj.nextInt();
        System.out.println(x);
        list.InsertAtBeg(x);
        list.display();
    }  
}