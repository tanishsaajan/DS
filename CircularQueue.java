import java.util.*;
class Queue
{
int front=-1,rear=-1;
int que[]=new int[4];
void Enqueue(int n)
{
    if(rear==-1&&front==-1)
    {
        front=rear=0;
        que[rear]=n;
        
    }
    else if((rear+1)%4==front)
    {
        System.out.println("Queue is full");
    }
    else
    {
        rear=(rear+1)%4;
        que[rear]=n;
        
    }
}
void Dequeue()
{
    
        System.out.println("");
    if(rear==-1&&front==-1)
    {
      front=rear=-1;
    }
    
    else{
       System.out.println(que[front]+" Elemented deleted ");
       front=(front+1)%4;
    }
}
void display()
{
    int i=front;
    
    if(rear==front)
    {
        
        System.out.println("Queue is empty");
    }
    
    while(i!=rear)
    {
        
        System.out.print(que[i]+" ");
        i=(i+1)%4;
        
    }
    
        System.out.print(que[rear]);
}
   

}
class Main
{
	public static void main(String[] args) {
	    Queue q=new Queue();
	    q.Enqueue(1);
	    	    q.Enqueue(2);
	    	    	    q.Enqueue(3);
	    	    	    
	    	    	    q.Enqueue(4);
	    	    	    q.display();
	    	    	    	    q.Dequeue();
	    	    	    	    q.Dequeue();
	    	    	    	    
	    	    q.Enqueue(5);
	    	    	    q.Enqueue(6);
 q.display();
	    	    	    	    
	    
	}
}