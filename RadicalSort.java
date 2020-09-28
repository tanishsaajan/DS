/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main
{
    void count(int arr[],int n)
    {
        int []countt=new int[n];
 
         int max = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
     for (int i = 0; i <= max; ++i) {
      countt[i] = 0;
    }
       for (int i = 0; i <n; i++) {
      countt[arr[i]]++;
    }

        int c[]=new int[n];
        
    for(int j=1;j<=max;j++)
        {
         countt[j]+=countt[j-1]; 
        }
            for(int i=n-1;i>=0;i--)
            {
                c[countt[arr[i]]-1]=arr[i];
                countt[arr[i]]--;
            }
    
        for (int i = 0; i <n; i++) {
      
          arr[i]=c[i];
    
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		
		Main ob=new Main();
	int size;
		   int[] data = { 2,5,3,1,1,7,9,7,2,5,4,9,3,6};
	size=data.length;
		    ob.count(data,size);
		
	}
}
