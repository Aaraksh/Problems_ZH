package set_6;

import java.util.Scanner;

public class Prg6_5 
{
	public static void add(int a,int b,int com)
	{
		int ans;
		ans=a+b;
		System.out.println("In Addition");
		System.out.println("Before: "+com);
		System.out.println("After: "+ans);
		if(ans==com)
			System.out.println("Results are same before and after adding zeros");
		else
			System.out.println("Results are different before and after adding zeros");
	}
	
	public static void sub(int a,int b, int com)
	{
		int ans;
		ans=a-b;
		System.out.println("In Subtraction");
		System.out.println("Before: "+com);
		System.out.println("After: "+ans);
		if(ans==com)
			System.out.println("Results are same before and after adding zeros");
		else
			System.out.println("Results are different before and after adding zeros");
		
	}

	public static void main(String[] args) 
	{
		int n1,n2,comp1,comp2;
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		s1=sc.next();
		System.out.println("Enter the second number: ");
		s2=sc.next();
		if(s1.matches("[0-9]+") && s2.matches("[0-9]+"))
		{
			comp1=Integer.parseInt(s1)+Integer.parseInt(s2);
			comp2=Integer.parseInt(s1)-Integer.parseInt(s2);
			s1=s1.replaceAll("0", "");
			s2=s2.replaceAll("0", "");
			n1=Integer.parseInt(s1);
			n2=Integer.parseInt(s2);
			add(n1,n2,comp1);
			sub(n1,n2,comp2);
		}		
		sc.close();
	}

}
