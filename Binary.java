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
int key=0;
key=s.nextInt();
int first=0;
        int last=arr.length-1;  
         int mid = (first + last)/2;  

   while( first <= last )
   {  

      if ( arr[mid] < key ){  

        first = mid + 1;     

      }else if ( arr[mid] == key ){  

        System.out.println("Element is found at index: " + mid);  

        break;  

      }else{  

         last = mid - 1;  

      }  

      mid = (first + last)/2;  

   }  

   if ( first > last ){  

      System.out.println("Element is not found!");  

   }  

          

 }  

}  
