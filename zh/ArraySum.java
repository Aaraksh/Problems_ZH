package zh;

import java.util.Scanner;

public class ArraySum 
{

	public static void main(String[] args)
	{
		int n,n1,i,j,r=0,sum=0;
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=0;
			n1=0;
			n1=sc.nextInt();
			sum=(n1*(n1+1))/2;
			while(sum>0)
			{
				j=sum%10;
				r=r+j;
				sum=sum/10;
			}
			a[i]=r;
			r=0;j=0;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
