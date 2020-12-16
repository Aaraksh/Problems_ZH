package practice_interview;

import java.util.Scanner;

public class Prac4 
{
	public static String reverse(String s)
	{
		if(s.isEmpty())
			return s;
		else
			return(reverse(s.substring(1))+s.charAt(0));
	}

	public static void main(String[] args) 
	{
		String str,s="",res;
		int i=0,len=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse: ");
		str=sc.nextLine();
		len=str.length();
		for(i=len-1;i>=0;i--)
		{
			while(i>=0 && str.charAt(i)!=' ')
			{
				s=s+str.substring(i, i+1);
				i--;
			}
			res=reverse(s);
			s="";
			System.out.print(res+" ");
		}
		sc.close();

	}

}
