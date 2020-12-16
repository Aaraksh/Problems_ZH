package set_8;

import java.util.Scanner;

public class S8P3 
{
	public static void substring(String str,int n)
	{
		int i,j,k,l;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				l=i+j;
				for(k=j;k<=l;k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.next();
		substring(str,str.length());
		sc.close();
	}

}
