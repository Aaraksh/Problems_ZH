package durga_prg;

import java.util.Scanner;

public class PrimeNum 
{
	public static void prime(int num)
	{
		int i,flag=0;
		for(i=2;i<=Math.sqrt(num);i++)
		{
			
			if(num%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("Given number is Primenumber");
		else
			System.out.println("Not a Primenumber");
	}
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		prime(num);
		sc.close();

	}

}
