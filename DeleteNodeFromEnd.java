import java.util.*;
public class Main {  
     class Node{  
        int data;  
        Node next;  
  
       Node(int val) {  
            data = val;  
           next = null;  
        }  
    }  
   Node head = null;  
   Node tail = null;
   Node temp=null;
     Node prevnode=null;
     public void atEnd(int data) {  
         Node newNode = new Node(data);
          
          if(head == null) {  
              head = newNode;  
              temp=head;
              prevnode=head;
              tail=head;
            
        }  
        
        else {  
              temp.next = newNode;  
            temp = newNode;  
        }  
     
    } 
    public void delete()
    {
    while(tail.next!=null)
    {
        prevnode=tail;
        tail=tail.next;
    }
    prevnode.next=null;
    }
    public void display() {  
         Node current = head;  
        if(head == null) {  
            System.out.println("Empty List");  
            return;  
        }  
         System.out.println("The list after deletion is:- ");
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
    
   list.atEnd(11);  
   
   list.delete();
        list.display();
    }
    
}