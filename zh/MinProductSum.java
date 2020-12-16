package zh;

import java.util.Scanner;

public class MinProductSum 
{

	public static void main(String[] args)
	{
		int n,k,t=0,p,sum=0,diff,maxdiff=0,i;
		int[] a=new int[50];
		int[] b=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n and k: ");
		n=sc.nextInt();
		k=sc.nextInt();
		System.out.println("Enter the A array values: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the B array values: ");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			p=a[i]*b[i];
			 if ( p < 0 && b[i] < 0 ) 
	            t = (a[i] +  2  * k ) * b[i];
	        else if( p < 0 && a[i] < 0) 
	            t = (a[i] - 2 * k) * b[i];
	        else if( p > 0 && a[i] < 0) 
	               t = (a[i] + 2 * k) * b[i];
	        else if (p > 0 && a[i] > 0)
	               t = (a[i] - 2 * k)  * b[i];
			 
			 diff =  Math.abs(p-t);
			 System.out.println("Diff: "+diff);
		     if( diff > maxdiff )
		     {
				maxdiff = diff;
				System.out.println("Max Diff: "+maxdiff);
		     }		    
		     sum = sum + p;
		     System.out.println("Min Sum: "+sum);
		}
		sum=sum-maxdiff;
		System.out.println("Minimum Sum: "+sum);
		sc.close();
	}

}
