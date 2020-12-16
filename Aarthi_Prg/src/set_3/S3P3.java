package set_3;

import java.util.Scanner;

public class S3P3 
{
	public static void xpatt(String s,int n)
	{
		int mid,i,j,k;
		mid=n/2;
		k=n-1;
		
		for(i=0;i<=mid;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j || j==k)
				{
					System.out.print(s.charAt(j));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			k--;
		}
		k+=2;
		for(i=mid-1;i>=0;i--)
		{
			for(j=0;j<n;j++)
			{
				if(i==j || j==k)
				{
					System.out.print(s.charAt(j));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			k++;
		}
		
	}

	public static void main(String[] args) 
	{
		String s;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		n=s.length();
		if(n%2 !=0)
		{
			xpatt(s,n);
		}
		else
		{
			System.out.println("String is not of odd length..Pattern cannot be printed!!");
		}
		sc.close();

	}

}
