package java_prg;

import java.util.Scanner;

public class HexAdd
{

	public static void main(String[] args) 
	{
		long n1,n2,sum;
		String s1,s2,reg="([A-Z]*[0-9]*)*";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		s1=sc.next();
		s2=sc.next();
		if(s1.matches(reg) && s2.matches(reg))
		{
			try
			{
				n1=Integer.parseInt(s1, 16);
				n2=Integer.parseInt(s2, 16);
				sum=n1+n2;
				String hex=Integer.toHexString((int) sum);
				System.out.println(hex+" "+sum);
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}
		}
		else
		{
			System.out.println("Error");
		}
		

	}

}
