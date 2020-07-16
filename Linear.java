import java.util.*;
class Main{
 public static void main(String args[]){  

Scanner s=new Scanner(System.in);
int size=s.nextInt();
        int arr[] = new int[size]; 
for(int i=0;i<arr.length;i++)
{
    arr[i]=s.nextInt();
}
int x=s.nextInt();
int y=0;
int g=0;
    int n = arr.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(arr[i] == x)
        {
           y=1;
           g=i;
        }
        
        
            
    } 
   

    if(y == 1) 
    
        System.out.print("Element is present at index " + g); 
    else

        System.out.print("Element is not present in array"); 

 }  

}  
