/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static void heapify(int arr[],int n,int i)
    {
        
        int largest=i;
        int left=2*i;
        int right=2*i+1;
        if(arr[left]>arr[largest])
        {
            largest=left;
        }
        if(arr[right]>arr[largest])
        {
            largest=right;
        }
         if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    }
	static int delete(int arr [],int n)
	{
	    int last=arr[n-1];
	    arr[0]=last;
	    n=n-1;
	    heapify(arr,n,0);
	    return n;
	}
	static void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
	
	
	public static void main(String[] args) {
		
		int arr[] = { 10, 5, 3, 2, 4 }; 
		int n=arr.length;
		n=delete(arr,n);
		
        printArray(arr, n); 
	}
}
