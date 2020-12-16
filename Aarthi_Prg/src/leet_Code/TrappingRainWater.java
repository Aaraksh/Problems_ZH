package leet_Code;

import java.util.Scanner;

public class TrappingRainWater 
{

	public static void main(String[] args) 
	{
		int i,n,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] l=new int[n];
		int[] r=new int[n];
		l[0]=a[0];
		for(i=1;i<n;i++)
		{
			l[i]=Math.max(a[i], l[i-1]);
		}
		r[n-1]=a[n-1];
		for(i=n-2;i>=0;i--)
		{
			r[i]=Math.max(a[i], r[i+1]);
		}
		for(i=0;i<n;i++)
		{
			res+=Math.min(l[i], r[i])-a[i];
		}
		System.out.println("Rain water trapped: "+res);
		sc.close();
	}

}
