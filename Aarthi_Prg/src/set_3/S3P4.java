package set_3;

import java.util.Scanner;

public class S3P4 
{

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s1=sc.next();
		System.out.println("Enter the substring to check: ");
		s2=sc.next();
		int ans = s1.indexOf(s2);
		System.out.println(ans);
		sc.close();	

	}

}
