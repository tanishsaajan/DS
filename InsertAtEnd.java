import java.util.*;
public class Main {  
     class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
     public void atEnd(int data) {  
         Node newNode = new Node(data);
          if(head == null) {  
              head = newNode;  
            tail = newNode;  
        }  
        else {  
              tail.next = newNode;  
            tail = newNode;  
        }  
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
        list.display();  
   list.atEnd(26);  
        list.display();  
   list.atEnd(45);  
        list.display(); 
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter new Element:- ");
        int x=obj.nextInt();
        System.out.println(x);
        list.atEnd(x);
        list.display();
    }  
}
