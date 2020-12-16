package SatClass;

import java.util.Scanner;

public class StrongPassword
{

	public static void main(String[] args)
	{
		char[] a;
		int i,len,di=1,up=1,lo=1,sp=1,count=0;
		String ss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.nextLine();
		len=ss.length();
		a=ss.toCharArray();
		for(i=0;i<len;i++)
		{
			if(a[i]>=97 && a[i]<=122)
			{
				System.out.println("lower case"+a[i]);
				lo=0;
			}
			if(a[i]>=65 && a[i]<=90)
			{
				System.out.println("upper case"+a[i]);
				up=0;
			}
			if(a[i]>=48 && a[i]<=57)
			{
				System.out.println("Digit"+a[i]);
				di=0;
			}
			if(a[i]=='!' || a[i]=='@' || a[i]=='#' || a[i]=='$' || a[i]=='%' || a[i]=='^' || a[i]=='&' || a[i]=='*' || a[i]=='(' || a[i]==')' || a[i]=='-' || a[i]=='+' )
			{
				System.out.println("Special character:"+a[i]);
				sp=0;
			}
		}
		if(len<6)
		{
			count=6-len;
		}
		count=count+lo+di+up+sp;
		System.out.println("Characters needed: "+count);
		sc.close();

	}

}
