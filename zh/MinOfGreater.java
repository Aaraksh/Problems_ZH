package zh;

import java.util.Scanner;

public class MinOfGreater
{

	public static void main(String[] args) 
	{
		int n,i,j,min=Integer.MAX_VALUE,max=0,flag=0;
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
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+">");
			min=Integer.MAX_VALUE;
			for(j=0;j<n;j++)
			{
				if(a[j]>a[i])
				{
					max=a[j];
					if(max<min)
					{
						min=max;
						flag=1;
					}
				}
			}
			if(flag==1)
			{
				System.out.print(min+" ");
			}
			flag=0;
		}
		

	}

}
