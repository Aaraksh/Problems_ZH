package set_papers_prg;

import java.util.Scanner;

public class Mul_Sum
{

	public static void main(String[] args) 
	{
		int a,b,mul=0,mid,c=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		if(a%2==0)
		{
			mid=a/2;
		}
		else
		{
			mid=a/2;
			c=1;
		}
		for(i=0;i<mid;i++)
		{
			mul=b+b;
			System.out.println(mul);
		}
		
		if(c==1)
			mul=mul+b;
		else
			mul=mul+mul;
		System.out.println("Mul Value: "+mul);
		sc.close();

	}

}
