package set_papers_prg;

import java.util.Scanner;

public class RecurWords
{

	public static String recur(String ss)
	{
		if(ss.isEmpty())
			return ss;
		else
			return(recur(ss.substring(1))+ss.charAt(0));	
		
	}
	public static void main(String[] args)
	{
		String s1,s;
		String[] st;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s1=sc.nextLine();
		StringBuilder str=new StringBuilder(s1);
		s=str.reverse().toString();
		st=s.split("\\s");
		for(i=0;i<st.length;i++)
		{
			st[i]=recur(st[i]);
			System.out.print(st[i]+" ");
		}
		
	/*	str=s1.split("\\s");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}   */
		sc.close();	
	}

}
