package set_15;

import java.util.Scanner;

public class Prg15_5 
{
	public static String strrev(String ss)
	{
		if(ss.isEmpty())
			return ss;
		else
			return(strrev(ss.substring(1))+ ss.charAt(0));
	}
	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s1=sc.nextLine();
		StringBuilder str=new StringBuilder(s1);
		str=str.reverse();
		s1=str.toString();
		String[] ss=s1.split("\\s");
		for(int i=0;i<ss.length;i++)
		{
			s2=strrev(ss[i]);
			System.out.print(s2+" ");
		}
		sc.close();

	}

}
