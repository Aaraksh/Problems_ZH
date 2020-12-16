package leet_Code;

import java.util.Scanner;

public class LastLen 
{

	public static void main(String[] args) 
	{
		int i,j,l,c=0;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check: ");
		s=sc.nextLine();
		s=s.trim();
		char[] a=s.toCharArray();
		l=s.length();
		for(i=l-1;i>=0;i--)
		{
			if((i-1 >=0) && (a[i-1] != ' '))
			{
				c++;
			}
			else
			{
				c++;
				break;
			}
		}
		System.out.println(c);

	}

}
