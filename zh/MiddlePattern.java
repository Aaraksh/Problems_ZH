package zh;

import java.util.Scanner;

public class MiddlePattern
{

	public static void main(String[] args)
	{
	
		int i=0,j=0,k=0,low=0,high=0,mid=0,l=0;
		String s;
		char[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.nextLine();
		l=s.length();
		a=new char[l];
		a=s.toCharArray();
		high=l-1;
		if(l%2!=0)
		{
			mid=(low+high)/2;
			for(i=mid;i<=l-1;i++)
			{
				for(j=mid;j<=i;j++)
				{
					System.out.print(a[j]);
				}
				System.out.println();
			}
			
			for(i=0;i<mid;i++)
			{
				for(k=mid;k<=l-1;k++)
				{
					System.out.print(a[k]);
				}
				for(j=0;j<=i;j++)
				{
					System.out.print(a[j]);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Enter the String in odd length");
		}
		sc.close();
	}

}
