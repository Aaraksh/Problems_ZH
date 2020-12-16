package set_12;

import java.util.Scanner;

public class Prg12_1
{
	public static void square(int ce,int n)
	{
		int sq=ce*ce;
		while(sq<=n)
		{
			System.out.print(sq+" ");
			ce++;
			sq=ce*ce;
		}
	}
	public static void main(String[] args) 
	{
		int a,b,ce;
		double sq;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		a=sc.nextInt();
		System.out.println("Enter b value: ");
		b=sc.nextInt();
		sq=Math.sqrt(a);
		ce=(int) Math.ceil(sq);
		//System.out.println(ce);
		square(ce,b);
		sc.close();

	}

}
