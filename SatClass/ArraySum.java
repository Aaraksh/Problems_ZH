package SatClass;

import java.util.Scanner;

public class ArraySum
{

	public static void main(String[] args) 
	{
	
		int i,n,sum=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum: "+sum);
	}

}
