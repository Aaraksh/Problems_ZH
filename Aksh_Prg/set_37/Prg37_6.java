package set_37;

import java.util.Scanner;

public class Prg37_6 
{

	public static void main(String[] args) 
	{
		int i,j,k,l=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<l;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			l+=2;
		}
		l-=4;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<l;k++)
			{
				System.out.print("*");
			}
			l-=2;
			System.out.println();
		}
		sc.close();

	}

}
