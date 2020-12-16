package set_4;

import java.util.Scanner;

public class S4P1
{

	public static void main(String[] args) 
	{
		
		int i,st,en;
		String s,e,reg="[0-9]+";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start range: ");
		s=sc.next();
		System.out.println("Enter the end range");
		e=sc.next();
		if(s.matches(reg) && e.matches(reg))
		{
			st=Integer.parseInt(s);
			en=Integer.parseInt(e);
			if(st%2==0)
			{
				st+=1;
			}
			System.out.println("Odd numbers between the given range: ");
			for(i=st+2;i<en;i+=2)
			{
				System.out.print(i+" ");
			}
		}
		else
		{
			System.out.println("Enter the valid number");
		}
		sc.close();
	}

}
