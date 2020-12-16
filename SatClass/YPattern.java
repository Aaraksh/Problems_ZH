package SatClass;

import java.util.Scanner;

public class YPattern 
{

	public static void main(String[] args) 
	{
		int i,j,k,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		c=n+n;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			for(k=n;k<=n+n;k++)
			{
				if(k==c)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
			c--;
			System.out.println();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(j==n)
				{
					System.out.print(" *");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
