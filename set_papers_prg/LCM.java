package set_papers_prg;

import java.util.Scanner;

public class LCM
{
	public int gcd(int a,int b)
	{
		if(a==0)
			return b;
		else 
			return gcd(b%a,a);
		
	}
	public int lcm(int a,int b)
	{
		int ss;
		ss=(a*b)*gcd(a,b);
		return ss;
	}

	public static void main(String[] args)
	{
		int n1,n2,ans;
		Scanner sc=new Scanner(System.in);
		LCM ll=new LCM();
		System.out.println("Enter the n1 value: ");
		n1=sc.nextInt();
		System.out.println("Enter the n2 value: ");
		n2=sc.nextInt();
		ans=ll.lcm(n1, n2);
		System.out.println("LCM of "+n1+" and "+n2+" is: "+ans);
		sc.close();

	}

}
