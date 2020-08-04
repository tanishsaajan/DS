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
    public void delete(int pos)
    {
        Node u=new Node(pos);
        int i=0;
    while(i<(pos-1))
    {
        tail=tail.next;
        i++;
    }
    u=tail.next;
    tail.next=u.next;
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

        list.display();
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the position of node you want to delete");
   int pos=s.nextInt();
   list.delete(pos);
  
        list.display();
    }
    
}
