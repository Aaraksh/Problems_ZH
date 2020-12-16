package java_prg;

import java.util.Scanner;

public class SwPrg
{

	public static void main(String[] args) 
	{
		int a,b,ans,c;
		char ch='y';
		Scanner sc=new Scanner(System.in);
		
		
		do
		{
			
			System.out.println("1.Add 2.Sub 3.Mul 4.Div");
			System.out.println("Enter your choice: ");
			c=sc.nextInt();
		switch(c)
		{
			case 1:
				System.out.println("Enter A value: ");
				a=sc.nextInt();
				System.out.println("Enter B value: ");
				b=sc.nextInt();
				ans=a+b;
				System.out.println(ans);
				break;
			case 2:
				System.out.println("Enter A value: ");
				a=sc.nextInt();
				System.out.println("Enter B value: ");
				b=sc.nextInt();
				ans=a-b;
				System.out.println(ans);
				break;
			case 3:
				System.out.println("Enter A value: ");
				a=sc.nextInt();
				System.out.println("Enter B value: ");
				b=sc.nextInt();
				ans=a*b;
				System.out.println(ans);
				break;
			case 4:
				System.out.println("Enter A value: ");
				a=sc.nextInt();
				System.out.println("Enter B value: ");
				b=sc.nextInt();
				ans=a/b;
				System.out.println(ans);
				break;
			default:
				System.out.println("You have entered the wrong choice!!");
			
		}
		System.out.println("Do you want to continue(y/n): ");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		sc.close();

	}

}
