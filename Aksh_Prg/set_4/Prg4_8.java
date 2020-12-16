package set_4;

import java.util.Scanner;

public class Prg4_8 
{
	static int quo=0,rem=0;
	static String str="";
	public static String findstring(int num)
	{
		int q;
		
		//r=num%26;
		q=num;
		if(q>0)
		{
			
			while(q>0)
			{
				rem=q%26;
				q=q/26;
				str=Character.toString((char)(rem+64))+str;
				//str=str+String.valueOf(rem+65);
			}
			
		}
		//str=str+Character.toString((char)(r+64));
		return str;
	}

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		String ss=findstring(num);
		System.out.println(ss);
		sc.close();
	}

}
