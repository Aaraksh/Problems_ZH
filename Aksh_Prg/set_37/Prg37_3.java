package set_37;

import java.util.Scanner;

public class Prg37_3 
{
	static boolean[] prime=new boolean[1001];
	public static void stieve()
	{
		
		int i,k;
		for(i=0;i<=1000;i++)
		{
			prime[i]=true;
		}
		for(k=2;k*k<1000;k++)
		{
			if(prime[k]==true)
			{
				for(i=k*k;i<1000;i+=k)
				{
					prime[i]=false;
				}
			}
		}
	}
	
	public static boolean prime(int n)
	{
		if(prime[n])
			return true;
		return false;
	}

	public static void main(String[] args) 
	{
		int n1,n2,nu,r,q=0;
		Scanner sc=new Scanner(System.in);
		stieve();
		System.out.println("Enter the number to check: ");
		n1=sc.nextInt();
		nu=n1;
		while(nu>0)
		{
			r=nu%10;
			q=q*10+r;
			nu=nu/10;
		}
		n2=q;
		if(prime(n1))
		{
			if(prime(n2))
				System.out.println("The given number "+n1+" is a Twisted primenumber");
			else
				System.out.println("The reverse of the given number is not a prime number");
		}
		else
			System.out.println("The given number is not a prime number");
		
		sc.close();
	}

}
