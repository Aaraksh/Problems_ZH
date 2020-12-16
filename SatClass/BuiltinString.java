package SatClass;

import java.util.Scanner;

public class BuiltinString
{

	public static void main(String[] args) 
	{
		String ss;
		boolean j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.nextLine();
		//boolean j = ss.matches("^[a-zA-Z]*\\.[?:jpg|png|com]$");
		boolean jj = ss.matches("(?i)(\\.(jpg|png|gif))*$"); //input: .png.png is valid
		if(jj)
			System.out.println("Done");
		j=ss.matches("^[a-zA-Z]*\\.(png|txt|c|img|jpg|jpeg|zip|apk|java|rar|pdf)*$");// input: only .png is valid
		if(j)
		{
			System.out.println("String match .png format");
		}
		boolean i = ss.matches("^[a-zA-Z]*$");
		if(i)
		{
			System.out.println("String Matches");
		}
		else
		{
			System.out.println("String doesn't match");
		}
								
		/*		System.out.println("===================To check Valid Digits========================");
		String d;
		System.out.println("Enter the phone number: ");
		d=sc.next();
		if(d.matches("^[0/91]?[7-9][0-9]{0}"))
		{
			System.out.println("Valid number");
		}
		else
		{
			System.out.println("Invalid number");
		}	*/
		sc.close();
	}

}
