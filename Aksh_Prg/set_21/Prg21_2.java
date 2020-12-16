package set_21;

import java.util.Scanner;

public class Prg21_2 
{
	static int c=0;
	public static boolean palindrome(String s1)
	{
		StringBuffer ss=new StringBuffer(s1);
		String s2;
		s2=ss.reverse().toString();
		if(s1.equals(s2))
			return true;
		return false;
	}
	public static void reverse(String r1)
	{
		StringBuffer sb=new StringBuffer(r1);
		String r2;
		int sum;
		boolean flag=false;
		r2=sb.reverse().toString();
		sum=Integer.parseInt(r1)+Integer.parseInt(r2);
		c++;
		flag=palindrome(Integer.toString(sum));
		if(c<=5)
		{
			if(flag )
				System.out.println(sum);
			else
				reverse(Integer.toString(sum));
		}
		else
			System.out.println("5 iterations are completed and the palindrome is not obtained!");
			
	}

	public static void main(String[] args) 
	{
		String s,reg1="\\d{2}",reg2="\\d{3}";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		s=sc.next();
		if(s.matches(reg1) || s.matches(reg2))
		{
			reverse(s);
		}
		sc.close();

	}

}
