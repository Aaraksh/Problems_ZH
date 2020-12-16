package set_12;

import java.util.Scanner;

public class Prg12_5 
{

	public static void main(String[] args) 
	{
		int c=0,n,i,j,k=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		for(i=n-1;i>=0;i--)
		{
			c=n;
			k++;
			num=k;
			for(j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=c;
				c--;
			}
			System.out.println();
		}
		sc.close();
	}

}
