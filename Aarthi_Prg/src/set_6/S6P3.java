package set_6;

import java.util.Scanner;

public class S6P3 
{

	public static void main(String[] args) 
	{
		int num,re,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		num=sc.nextInt();
		n=num;
		while(num>9)
		{
			while(num>0)
			{
				re=num%10;
				sum=sum+re;
				num=num/10;
			}
			num=sum;
			sum=0;
		}
		if(num==1)
		{
			System.out.println(n+" is a Magic Number.");
		}
		else
		{
			System.out.println(n+" is not a Magic Number.");
		}
		sc.close();

	}

}
