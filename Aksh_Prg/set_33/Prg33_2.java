package set_33;

import java.util.Scanner;

public class Prg33_2 
{
	public static int add(int n1,int n2)
	{
		int ans;
		ans=n1+n2;
		return ans;
	}
	public static int sub(int n1,int n2)
	{
		int ans;
		if(n1<0)
		{
			ans=(-(n1))+n2;
		}
		else if(n2<0)
			ans=n1+(-(n2));
		else if(n1<0 && n2<0)
			ans=n1+(-n2);
		else
			ans=n1+n2;
		
		return ans;
	}
	public static int mul(int n1,int n2)
	{
		
		return 0;
	}
	public static int div(int n1,int n2)
	{
		return 0;
	}

	public static void main(String[] args) 
	{
		int n1,n2,a,s,m,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		a=add(n1, n2);
		s=sub(n1, n2);
		m=mul(n1, n2);
		d=div(n1, n2);
		System.out.println("Addition: "+a);
		System.out.println("Subtraction: "+s);
		System.out.println("Multiplication: "+m);
		System.out.println("Division: "+d);
		sc.close();

	}

}
