package SatClass;

import java.util.Scanner;

public class MaxElement
{

	public static void main(String[] args)
	{
		
		int i,j,n,temp=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
