import java.util.*;
 class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		int k=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{
		    
		        if(arr[i]>k)
		        {
		           k=arr[i]; 
		        }
		        
		 
		    
		}
	
		
		System.out.print(k);
	}
}