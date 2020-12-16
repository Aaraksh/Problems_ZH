package SatClass;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{

	public static void main(String[] args) 
	{
	
		String s1,s2;
		char[] a;
		char[]b;
		int i,n1,n2,flag=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string 1: ");
		s1=sc.nextLine();
		System.out.print("Enter the String 2: ");
		s2=sc.nextLine();
		
		if(s1.isEmpty() || s2.isEmpty())
		{
			c=0;
		}
		if(c==1)
		{		
			s1=s1.replaceAll("\\s+", "");
			n1=s1.length();
			s2=s2.replaceAll("\\s+", "");
			n2=s2.length();
			
			//System.out.println("String 1: "+s1+" Length: "+n1);
			//System.out.println("String 2: "+s2+" Length: "+n2);
			
			a=s1.toCharArray();
			Arrays.sort(a);
			b=s2.toCharArray();
			Arrays.sort(b);
			
			for(i=0;i<n1;i++)
			{
				if(a[i]==b[i])
				{
					flag++;
				}
			}
			
			if(flag==n1)
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("Not an Anagram");		

		}
		else
			System.out.println("Error");
		
		sc.close();
	}

}
