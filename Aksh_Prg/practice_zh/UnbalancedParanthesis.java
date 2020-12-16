package practice_zh;

import java.util.Scanner;

public class UnbalancedParanthesis 
{

	public static void main(String[] args) 
	{
		String s1;
		int[] temp;
		int i=0,c=0,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s1=sc.next();
		temp=new int[s1.length()];
		for(i=1;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)=='(')
			{
				temp[c]=i;
				c++;
			}
			if(s1.charAt(i)==')')
			{
				if(c!=0)
				{
					c--;
				}
				else
				{
					temp[c]=i;
					c++;
				}
			}
		}
		
		
		for(i=0;i<s1.length();i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==temp[j])
					flag=1;
			}
			if(flag!=1)
				System.out.print(s1.charAt(i));
			flag=0;
		}
		sc.close();
	}

}
