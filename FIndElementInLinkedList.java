import java.util.*;
public class Main {  
    Node head;
     class Node{  
        int data;  
        Node next;  
  
       Node(int val) {  
            data = val;  
            next = null;  
        }  
    }  
     public void ADD(int data) {  
         Node ne = new Node(data);
        if(head==null)
        {
            head=ne;
        }
        else{
            Node n1=head;
            while(n1.next!=null)
            {
                n1=n1.next;
            }
            n1.next=ne;
        }
        
        
    }  
    public void display(int d) {  
        int flag=0;
        int i=0;
         Node currt = head;
         
        while(currt != null) {  
            if(d==currt.data)
            {
                flag=1;
                break;
            }
            i++;
        currt=currt.next;
            
        }  
        
        if(flag==1)
        {
            
                System.out.print("Found at Node "+i);
        }
        else{
                System.out.print("Not FOund");
        }
    }  
  
    public static void main(String[] args) {  
  
        Main list = new Main();  
    list.ADD(55);  
   list.ADD(6);  
   list.ADD(45);  
        list.display(6);
     
       
    }
}