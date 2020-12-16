package zh;

import java.util.Scanner;

public class Unique
{

	public static void main(String[] args) 
	{
		int[] a;
        
        int i=0,j=0,k,n,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        a=new int[n];
      
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        n1=n;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n1;j++)
            {
                if(a[i]==a[j])
                {
                   for(k=j;k<n-1;k++)
                   {
                       a[k]=a[k+1];
                   }
                    n1--;
                j--;
                }
                
            }
            
        }
        System.out.println("Output Array: ");
        for(i=0;i<n1;i++)
        {
            System.out.print(a[i]+" ");    
        }
        sc.close();

	}

}
