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
   
   Node temp=null;
     Node tail=null;
     public void atEnd(int data) {  
         Node newNode = new Node(data);
          
          if(head == null) {  
              head = newNode;  
              temp=head;
              tail=head;
             
        }  
        
        else {  
              temp.next = newNode;  
            temp = newNode;  
        }  
     
    } 
    public void add(int n,int pos)
    {
        Node x=new Node(n);
        Node y=new Node(pos);
        int i=0;
       while(i<pos-1)
       {
           tail=tail.next;
           i++;
       }
       x.next=tail.next;
       tail.next=x;
  
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
 
        list.display();
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the element you want to add");
   int n=s.nextInt();
   System.out.println("Enter the positon where you want to add");
  int pos=s.nextInt();
  list.add(n,pos);
  
        list.display();
    }
    
}
