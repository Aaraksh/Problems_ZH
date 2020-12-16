package java_prg;

import java.util.Scanner;

public class Vowel 
{

	public static void main(String[] args) 
	{
	int n = 0,i;
	String na;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	na=sc.next();
	char a[]=new char[na.length()];
	for(i=1;i<=na.length();i++)
	{
		System.out.println(a[i]);
		if(a[i]=='a' || a[i]=='e'|| a[i]=='i'|| a[i]=='o' || a[i]=='u')
		{
			n++;
		}
	}
	  System.out.println(n);
	}

}
