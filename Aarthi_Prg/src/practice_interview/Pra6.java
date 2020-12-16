package practice_interview;

import java.util.Scanner;

public class Pra6
{

	public static void main(String[] args) 
	{
		int n,r;
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%26;
			if(r!=0)
			{
				s=Character.toString((char)(r+64))+s;
				n/=26;
			}
			else
			{
				s="Z"+s;
				n/=27;
			}			
		}
		System.out.println(s);
		sc.close();

	}

}
