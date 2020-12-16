package set_34;

import java.util.Scanner;

public class Prg34_1 
{

	public static void main(String[] args) 
	{		
		int i,j;
		String s1,s2,res="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String: ");
		s1=sc.next();
		System.out.println("Enter the second String: ");
		s2=sc.next();
		
		for(i=0;i<s2.length();i++)
		{
			
			for(j=0;j<s1.length();j++)
			{
				
				if(s1.charAt(j)==s2.charAt(i))
				{
					
					//System.out.println(s2.charAt(i)+" "+s1.charAt(j));
					res=s1.replace(s1.substring(j, j+1), "");
					s1=res;
				}
				
			}
		}
		System.out.println(res);
		sc.close();
		
	}

}
