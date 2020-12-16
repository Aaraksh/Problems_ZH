package set_21;

import java.util.Scanner;

public class Prg21_1 
{
	public static int prime(int n)
	{
		if(n<=0)
			return 0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return 0;
		}
		return 1;
	}
	public static void sumofPrime(int num)
	{
		int i,mid=0,res=0,flag=0,c=0;
		mid=num/2;
		
		for(i=2;i<=mid;i++)
		{
			res=prime(i);
			//System.out.println(res);
			if(res==1)
			{
				flag=prime(num-i);
				if(flag==1)
				{
					System.out.println(num+" can be written as the sum of two prime numbers.");
					System.out.println("Numbers are: "+i+" and "+(num-i));
					c=1;
					break;
				}
			}
		}
		if(c==0)
			System.out.println(num+" cannot be written as the sum of two prime numbers.");
	}
	public static void main(String[] args) 
	{
		int num;
		String ss,reg="[0-9]+";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		ss=sc.next();
		if(ss.matches(reg))
		{
			num=Integer.parseInt(ss);
			sumofPrime(num);
		}
		else
		{
			System.out.println("Enter the valid input number!!");
		}
		sc.close();

	}

}
