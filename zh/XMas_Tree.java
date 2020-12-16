package zh;

import java.util.Scanner;

public class XMas_Tree 
{

	public static void main(String[] args) 
	{
		int i,k,n,row,j,l,c=0,co,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the tree: ");
		n=sc.nextInt();
		row=n-3;
		x=n;
		for(i=0;i<=row;i++)
		{
			l=n;
			co=c;
			for(j=0;j<3;j++)
			{
				for(k=0;k<l-1;k++)
				{
					System.out.print(" ");
				}
				l--;
				for(k=0;k<=co;k++)
				{
					System.out.print("* ");
				}
				co++;
				System.out.println();
			}
			n--;
			c+=1;
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<x-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		sc.close();

	}

}
