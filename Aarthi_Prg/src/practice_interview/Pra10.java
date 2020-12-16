package practice_interview;

import java.util.Scanner;

public class Pra10 
{

	public static void main(String[] args) 
	{
		String reg,str;
		//int len,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		str=sc.next();
		System.out.println("Enter the regular expression: ");
		reg=sc.next();
		if(str.matches(reg))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();

	}

}
