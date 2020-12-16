package set_23;

import java.util.Scanner;

public class Prg23_1
{
	public static boolean checknum(String str)
	{
		if(str== null)
			return false;
		try
		{
			@SuppressWarnings("unused")
			int num=Integer.parseInt(str);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Invalid input: "+str);
			return false;
		}
	}

	public static void main(String[] args) 
	{
		String s1,s2,s3;
		int max,a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b and c: ");
		s1=sc.next();
		s2=sc.next();
		s3=sc.next();
		//if(s1.matches(reg) && s2.matches(reg) &&)
		if(checknum(s1) && checknum(s2) && checknum(s3))
		{
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=Integer.parseInt(s3);
			
			max=(a>b)?((a>c)?a:b):((b>c)?b:c);
			System.out.println("Maximum of three numbers: "+max);
		}
		sc.close();
	}

}
