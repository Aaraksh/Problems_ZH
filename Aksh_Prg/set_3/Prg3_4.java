package set_3;

import java.util.Scanner;

public class Prg3_4 
{

	public static void main(String[] args) 
	{
		String str,sub;
		int flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		System.out.println("Enter the substring: ");
		sub=sc.next();
		flag=str.indexOf(sub);
		System.out.println(flag);	
		sc.close();
	}

}
