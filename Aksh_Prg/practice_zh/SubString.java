package practice_zh;

import java.util.Scanner;

public class SubString
{
	public static boolean check(String s1,String s2,int m,int n)
	{
		if(m==0)
			return true;
		if(n==0)
			return false;
		
		if(s1.charAt(m-1)==s2.charAt(n-1))
			return check(s1,s2,m-1,n-1);
		else
			return check(s1,s2,m,n-1);
			
	}
	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1: ");
		s1=sc.next();
		System.out.println("Enter the String2: ");
		s2=sc.next();
		boolean res = check(s1,s2,s1.length(),s2.length());
		if(res==true)
			System.out.println("Substring is present.");
		else
			System.out.println("Substring is not present");
		sc.close();

	}

}
