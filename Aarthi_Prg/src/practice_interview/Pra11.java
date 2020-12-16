package practice_interview;

import java.util.Scanner;

public class Pra11 
{

	public static void main(String[] args) 
	{
		int i,j,l1,l2,n,su=0,ca=0;
		
		String s1,s2,reg="[0-1]+",str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1: ");
		s1=sc.next();
		System.out.println("Enter the String2: ");
		s2=sc.next();
		l1=s1.length()-1;
		l2=s2.length()-1;
		n=(l1<l2)?l1:l2;
		if(s1.matches(reg) && s2.matches(reg))
		{
			while(l1>=0 && l2>=0)
			{
				
			}
		}
		else
		{
			System.out.println("Not a valid binary number!!");
		}
	}

}
