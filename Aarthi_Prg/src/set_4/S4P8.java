package set_4;

import java.util.Scanner;

public class S4P8
{
	public static void findval(int num)
	{
		int r,n,v;
		String s="";
		n=num;
		while(n>0)
		{
			r=n%26;
			v=r+64;
			s=Character.toString((char)v)+s;
			n=n/26;
		}
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		findval(n);
		sc.close();
	}

}
