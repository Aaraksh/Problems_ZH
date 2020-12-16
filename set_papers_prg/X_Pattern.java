package set_papers_prg;

import java.util.Scanner;

public class X_Pattern 
{

	public static void main(String[] args) 
	{
		int n,i,j,k,st=0;
		String ss;
		char[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.next();
		n=ss.length();
		if(n%2==0)
		{
			ss=ss+"#";
			n++;
		}
		System.out.println(ss);
		a=ss.toCharArray();
		k=n-1;
		for(i=0;i<=n/2;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==i || j==k)
				{
					System.out.print(a[j]);
				}
				else
					System.out.print(" ");
			}
			k--;
			System.out.println();
		}
		k=n/2-1;
		for(i=n/2+1;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==k || j==i)
				{
					System.out.print(a[j]);
				}
				else
					System.out.print(" ");
			}
			k--;
			System.out.println();
		}

	}

}
