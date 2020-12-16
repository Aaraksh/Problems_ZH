package SatClass;

import java.util.Scanner;

public class Spinit
{

	public static void main(String[] args)
	{
		
		int n,i,j,k,st,flag;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		flag=a[0];
		for(i=0;i<n;i++)
		{
			st=a[n-1];
			for(j=n-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=st;
			if(st==flag)
				break;

		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	/*	for(i=0;i<n;i++)
		{
			st=a[n-1];
			for(j=n-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=st;
			
			for(k=0;k<n;k++)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}     */
		sc.close();
	}

}
