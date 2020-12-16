package set_papers_prg;

import java.util.Scanner;

public class Number_Sum
{

	public static void main(String[] args) 
	{
		int i,j,n,sum,flag,c=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		
		a=new int[n];
		System.out.println("Enter the array elements: ");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the flag value: ");
		flag=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(sum>flag)
					break;
				
				if(sum==flag)
				{
					c=1;
					break;
				}
			}
		}
		if(c==1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		sc.close();

	}

}
