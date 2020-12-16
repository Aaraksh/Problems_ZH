package SatClass;

import java.util.Arrays;
import java.util.Scanner;

public class NoAdjacentMaxSum 
{

	public static void main(String[] args)
	{
		int n,i;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Entre the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Sorted Array:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int max=a[n-1]+a[n-3];
		System.out.println("Maximum Sum: "+max);
		sc.close();
	}

}
