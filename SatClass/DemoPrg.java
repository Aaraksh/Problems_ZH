package SatClass;

import java.util.Scanner;

public class DemoPrg 
{

	public static void main(String[] args) 
	{
		char[] ch;
		char a;
		int i = 0,len,n,k;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.nextLine();
		len=s.length();
		ch=new char[len];
		System.out.println("Enter the key: ");
		k=sc.nextInt();
		ch=s.toCharArray();
		for(i=0;i<len;i++)
		{
			
			if(Character.isUpperCase(ch[i]))
			{	
				n=ch[i]+k;
				if(n>90)
				{
					n=n-26;
				}
				ch[i]=(char) n;
			}
			if(Character.isLowerCase(ch[i]))
			{
				n=ch[i]+k;
				if(n>122)
				{
					n=n-26;
				}
				ch[i]=(char) n;
			}
			
		}
		s=ch.toString().copyValueOf(ch);
		System.out.println(s);
	}

}
