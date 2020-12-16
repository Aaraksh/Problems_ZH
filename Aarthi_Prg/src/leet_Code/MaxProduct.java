package leet_Code;

import java.util.Scanner;

public class MaxProduct 
{

	public static void main(String[] args) 
	{
		int i,res,max,min,t,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		l=sc.nextInt();
		int[] a=new int[l];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		res=a[0];
		for(i=1;i<l;i++)
		{
			t=max;
			max=Math.max(Math.max(max*a[i], min*a[i]), a[i]);
			min=Math.min(Math.min(t*a[i], min*a[i]), a[i]);
			if(max>res)
				res=max;
		}
		System.out.println("Maximum product of the subarray: "+res);
		sc.close();

	}

}
