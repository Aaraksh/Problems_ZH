package hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StringTwist 
{

	public static void main(String[] args) 
	{
		String s1,s2,s3,st1="",st2="",st3="";
		int i,l1,l2,l3;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		s1=sc.next();
		System.out.println("Enter the String 2: ");
		s2=sc.next();
		System.out.println("Enter the String 3: ");
		s3=sc.next();
		l1=s1.length();
		l2=s2.length();
		l3=s3.length();
		for(i=0;i<l1;i++)
		{
			c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
			{
				c='%';
			}
			st1=st1+c;
		}
		for(i=0;i<l2;i++)
		{
			c=s2.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U' )
			{
				c='$';
			}
			st2=st2+c;
		}
		for(i=0;i<l3;i++)
		{
			c=s3.charAt(i);
			if(c>='a' && c<='z')
				c=(char) (c-32);
			
			st3=st3+c;
		}
		System.out.println(st1+" "+st2+" "+st3);
		
		System.out.println("====================================================================");
		double d=102.0987987;
		DecimalFormat dd=new DecimalFormat(".###");
		System.out.println(dd.format(d));
		
		
		sc.close();

	}

}
