package zoho;

import java.util.Scanner;

public class StringIndex 
{

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		s1=sc.next();
		System.out.println("Enter the SubString to find: ");
		s2=sc.next();
		int res = s1.indexOf(s2);
		System.out.println("Output: "+res);
		sc.close();

	}

}
