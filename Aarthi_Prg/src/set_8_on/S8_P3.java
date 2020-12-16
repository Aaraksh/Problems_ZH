package set_8_on;

import java.util.Scanner;

public class S8_P3 
{

	public static int binary(int n)
	{
		String s="";
		int r;
		while(n!=1)
		{
			r=n%2;
			s=Integer.toString(r)+s;
			n=n/2;
		}
		s=1+s;
		//System.out.println(s);
		return Integer.parseInt(s);
	}
	
	public static void reverse(int n)
	{
		int d,r,s=0;
		String str="";
		d=n;
		while(n>0)
		{
			r=n%10;
			//s=s*10+r;
			str=str+Integer.toString(r);
			n=n/10;
		}
		s=Integer.parseInt(str);
		System.out.println("Reversed Number: "+str);
		if(s==d)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not a palindrome");
	}
	
	public static void main(String[] args) 
	{
		int n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		c=binary(n);
		System.out.println("Binary value of a given number: "+c);
		reverse(c);
		sc.close();
	}

}
