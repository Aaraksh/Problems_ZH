package practice_zh;

import java.util.Scanner;

public class PrintFibo 
{
	public static boolean check(int n)
	{
		int a=0,b=1;
		if(n==a || n==b)
			return true;
		int c=a+b;
		while(c<=n)
		{
			if(c==n)
				return true;
			a=b;
			b=c;
			c=a+b;
			
		}
		return false;
	}

	public static void main(String[] args)
	{
		int n,i;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements:  ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			boolean ans=check(a[i]);
			if(ans==true)
			{
				System.out.println(a[i]);
			}
		}
		sc.close();

	}

}
