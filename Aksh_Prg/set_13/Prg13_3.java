package set_13;

import java.util.Scanner;

public class Prg13_3
{

	public static void main(String[] args) 
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		if(n<10)
			count+=n;
		if(n>9 && n<99)
		{
			count+=(2*(n-9))+9;
		}
		if(n>99 && n<1000)
			count+=(3*(n-99))+(2*(99-9))+9;
		
		System.out.println(count);
		sc.close();

	}

}
