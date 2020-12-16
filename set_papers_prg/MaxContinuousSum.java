package set_papers_prg;

import java.util.Scanner;

public class MaxContinuousSum
{

	public static void main(String[] args) 
	{
		int newmax=0,max=0,n,i,start=0,end=0,k=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			newmax=newmax+a[i];
			if(newmax>max)
			{
				max=newmax;
				if(k==0)
				{
					start=i;
					k++;
				}
				end=i;
			}
			if(newmax<0)
				newmax=0;
			
		}
		System.out.println(max);
		System.out.println("Elements are: ");
		for(i=start;i<=end;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
