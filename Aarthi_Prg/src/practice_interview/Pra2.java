package practice_interview;

import java.util.Scanner;

public class Pra2 
{

	public static void main(String[] args) 
	{
		String s1,s2;
		int i,index=-1,l1,l2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s1=sc.next();
		System.out.println("Enter the substring: ");
		s2=sc.next();
		l1=s1.length();
		l2=s2.length();
		
		if(l1>=l2)
		{
			for(i=0;i<l1;i++)
			{
				if(s1.substring(i, i+1).equals(s2.substring(0, 1)) && (i+l2-1)<l1)
				{
					if(s1.substring(i,(i+l2)).equals(s2))
					{
						index=i;
						break;
					}
					else
					{
						index=-1;
					}
				}
			}
		}
		System.out.println(index);
		sc.close();
	}

}
