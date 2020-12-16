package set_12;

import java.util.Scanner;

public class Prg12_4 
{

	public static void main(String[] args) 
	{
		long a,b;
		int c=0,i=0;
		int[] sum=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first binary number: ");
		a=sc.nextLong();
		System.out.println("Enter the second binary number: ");
		b=sc.nextLong();
		
		while(a!=0 || b!=0)
		{
			sum[i++]=(int)((a%10 + b%10 + c)%2);
			c=(int)((a%10 + b%10 + c)/2);
			
			a=a/10;
			b=b/10;
			//System.out.println(sum[i-1]+" "+a+" "+b);
		}
		if(c!=0)
		{
			sum[i++]=c;
		}
		i--;
		while(i>=0)
		{
			System.out.print(sum[i]);
			i--;
		}
		sc.close();
	}

}
