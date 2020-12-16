package leet_Code;

import java.util.Scanner;

public class LongestSub 
{

	public static void main(String[] args) 
	{
		String s,s2="";
		int i,j,max=0,c=1,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		len=s.length();
		s2=s.substring(0, 1);
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<=len;j++)
			{
				StringBuilder sb1=new StringBuilder(s.substring(i, j));
				System.out.println(sb1);
				String c1;
				c1=sb1.toString();
				String c2=sb1.reverse().toString();
				c=s.substring(i, j).toString().length();
				if(c1.equals(c2) && c>max)
				{
					//System.out.println(sb1+" "+c2);
					max=c;
					s2=s.substring(i, j).toString();
				}
				
			}
		}
		System.out.println(s2);

	}

}
