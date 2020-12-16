package set_3;

import java.util.Scanner;

public class S3P1
{
	public static void printstr(String s,int n)
	{
		int i,j,num=0,flag=0;
		//char[] a=s.toCharArray();
		char key = 0;
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)>96 && s.charAt(i)<123)
			{
				key=s.charAt(i);
				i++;
				//System.out.println(s.charAt(i));
			}
			if((i+2)<n && Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i+2)))
			{
				System.out.println("Condition fails because number exceeds 99");
				i+=2;
				flag=1;
				break;
			}
			else if((i+1)<n &&Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i+1)))
			{
				num=Integer.parseInt(s.substring(i, i+2));
				//System.out.println(num);
				i++;
			}
			else
			{
				num=Integer.parseInt(s.substring(i, i+1));
				//System.out.println(num);
			}
			
			//System.out.println("*"+num);
			for(j=0;j<num && flag==0;j++)
			{
				System.out.print(key);
			}
				
		}
			
			
		
	}

	public static void main(String[] args) 
	{
		String s,reg="[a-z0-9]+";
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		if(s.matches(reg))
		{
			//System.out.println("Valid check!!");
			n=s.length();
			printstr(s,n);
		}
		else
		{
			System.out.println("Invalid string");
		}
		sc.close();

	}

}
