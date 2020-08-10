import java.util.*;
class Stack
{
    int size=10;
    int a[]=new int[size];
    int top1=-1;
    int top2=size;
    
    void push1(int push1)
    {
        if(top1>top2-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
        top1=top1+1;
            a[top1]=push1;
           System.out.println(a[top1] + " pushed into stack1"); 
        }
    }
    
    void push2(int push2)
    {
        if(top1>top2-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
        top2=top2-1;
            a[top2]=push2;
           System.out.println(a[top2] + " pushed into stack2"); 
        }
    }
    
    int pop1()
    {
        if(top1>=0)
        {
            int pop1=a[top1];
            top1--;
            return pop1;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
    
    int pop2()
    {
        if(top2<size)
        {
            int pop2=a[top2];
            top2++;
            return pop2;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
}
     class Main
{
public static void main(String args[])
    {
        Stack st=new Stack();
        
        st.push1(20);
        st.push2(40);
        st.push1(60);
        st.push1(80);
        st.push2(100);
        
        System.out.println(st.pop1()+" Popped From Stack 1");
        System.out.println(st.pop2()+" Popped From Stack 2");
    }
}