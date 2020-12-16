package leet_Code;

import java.util.Scanner;

public class Divide 
{
	public static int divide(int n1,int n2)
	{
		int rem=0,s1,s2,c=0;
		s1=(n1<0)?-1:1;
		s2=(n2<0)?-1:1;
		//n1=(n1<0)?(-n1):n1;
		if(n1<0)
		{
			System.out.println("CHECK");
			n1=n1*-1;
			System.out.println(n1);
		}
		n2=(n2<0)?(-n2):n2;
		if(n2==0)
			return Integer.MIN_VALUE;
		if(n1<n2)
		{
			System.out.println("IN HERE"+n1);
			return 0;
		}
		if(n2==1)
		{
			System.out.println("In");
			c=n1;
		}
		rem=n1;
		while(rem>=n2)
		{
			rem=rem-n2;
			c++;
		}
		return c*s1*s2;
			
	}
	public static void main(String[] args) 
	{
		int i,n,n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend: ");
		n1=sc.nextInt();
		System.out.println("Enter the divisor: ");
		n2=sc.nextInt();
		n=divide(n1, n2);
		System.out.println(n);
		sc.close();

	}

}
