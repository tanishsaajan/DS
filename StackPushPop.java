import java.util.*;
class Stack{
     int x=0;
  int top=-1;
  int size=1000;
  int a[]=new int[size];
  boolean push(int arr[])
  {
      if(top>=size-1)
      {
          System.out.println("StackOverflowError");
          return false;
      }
      else{
          top=top+1;
          a[top]=arr[top];
           System.out.println(a[top] + " pushed into stack"); 
            return true; 
        } 
      
  }
     int pop(int arr[]) 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int  x = a[top];
            top=top-1;
            return x; 
            } 
    } 
    
    }
    class Main
{
  
    public static void main(String args[]) 
    {
         Stack st = new Stack(); 
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  int size=s.nextInt();
  int arr[]=new int[size];
  int h=0;
  for(int i=0;i<size;i++)
  {
      
  System.out.println("Enter the element");
     arr[i]=s.nextInt();
    
     st.push(arr);
     
  }
  
  System.out.println(st.pop(arr) + " Popped from stack");
    }
  
}