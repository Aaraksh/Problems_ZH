package SatClass;

import java.util.Scanner;
import java.util.regex.*;

public class RegularExp
{

	public static void main(String[] args) 
	{
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s1=sc.nextLine();
		//Pattern p=Pattern.compile("a-zA-Z_*,!?()\";.-\\s");
		Pattern p=Pattern.compile("a-zA-Z");
		Matcher m=p.matcher(s1);
		if(Pattern.matches("a-zA-Z", s1))
		{
			System.out.println("check: True ");
		}
		else
		{
			System.out.println("check: False");
		}
		
		if(m.find())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		sc.close();
	}

}
