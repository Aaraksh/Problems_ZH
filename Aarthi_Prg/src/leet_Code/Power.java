package leet_Code;

import java.util.Scanner;

public class Power 
{

	public static void main(String[] args) 
	{
		double n1,n2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1: ");
		n1=sc.nextDouble();
		System.out.println("Enter the number2: ");
		n2=sc.nextDouble();
		res=Math.pow(n1, n2);
		
		System.out.println(res);
		sc.close();

	}

}
