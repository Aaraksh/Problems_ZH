package zh;

import java.util.Scanner;

public class Xpattern 
{

	public static void main(String[] args)
	{
	    String s;
	    int l,i,j,k;
	    char[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.nextLine();
		
		l=s.length();
		a=new char[l];
		a=s.toCharArray();
		k=l-1;
		for(i=0;i<l/2;i++)
		{
			for(j=0;j<l;j++)
			{
				if(j==i || j==k)
				{
					System.out.print(a[j]);
				}
				else
				{
					System.out.print(" ");
				}
		   //  k--;
			}
			k--;
			System.out.println();
		}
   		k=l/2;
		
		for(i=l/2;i>=0;i--)
		{
			for(j=0;j<l;j++)
			{
				if(j==i || j==k)
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

}
