package practice_prg;

import java.util.Scanner;

public class Great3Num 
{
	public static int great(int a,int b,int c)
	{
		int max;
		max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
	public static void main(String[] args) 
	{
		int a,b,c,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b and c: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		max=great(a,b,c);
		System.out.println("Greatest of three numbers: "+max);
		sc.close();
	}

}
