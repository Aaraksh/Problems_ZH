package set_1;

import java.util.Scanner;

public class S1P1 
{
	public static void pattern(char a[],int n)
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
					System.out.print(a[j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k--;
			System.out.println();
		}
		k+=2;
		for(i=mid-1;i>=0;i--)
		{
			for(j=0;j<n;j++)
			{
				if(i==j || j==k)
				{
					System.out.print(a[j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}
		
	}

	public static void main(String[] args) 
	{
		String str;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to print pattern: ");
		str=sc.next();
		char[] a=str.toCharArray();
		n=a.length;
		if(n%2!=0)
		{
			pattern(a,n);
		}
		else
		{
			System.out.println("Enter the string of odd length!!");
		}
		sc.close();
	}

}
