package practice_zh;

import java.util.Scanner;

public class RegressionString 
{
	public static void match(String s1,String reg)
	{
		String s,reg1=reg+"\0";
		if(s1.contains("*"))
		{
			s=reg.substring(s1.indexOf('*'), s1.indexOf('*')+1);
			s=s.replace("*", "\\*");
			System.out.println("String: "+reg1.substring(0, reg1.indexOf('*')));
			System.out.println("String: "+s);
			System.out.println("String: "+reg1.substring(reg.indexOf('*')+1, reg.length()+1));
			reg=reg1.substring(0, reg1.indexOf('*'))+s+reg1.substring(reg.indexOf('*')+1, reg.length()+1);
			//reg=reg.replaceAll("\\*", "(.*)");
			System.out.println(reg);
		}
		else
			reg=reg.replaceAll("\\*", "(.*)");
		
		if(s1.matches(reg))
			System.out.println("True");
		else
			System.out.println("False");
	}

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1: ");
		s1=sc.next();
		System.out.println("Enter the RegularExpression: ");
		s2=sc.next();
		match(s1,s2);
		sc.close();

	}

}
