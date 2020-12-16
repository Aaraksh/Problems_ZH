package SatClass;

import java.util.Scanner;

public class ArrayRotation
{

	public static void main(String[] args)
	{
		int i,j,m,n;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to rotate: ");
		m=sc.nextInt();
		int t=0;
		if(m<n)
		{
			for(i=0;i<m;i++)
			{
				t=a[0];
				for(j=0;j<n;j++)
				{
					
					if(j<n-1)
					{
						a[j]=a[j+1];
					}
					else
					{
						a[j]=t;
					}
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
