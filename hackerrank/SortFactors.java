package hackerrank;

import java.util.Scanner;

public class SortFactors 
{

	public static void main(String[] args) 
	{
		int a[],b[];
		int i,j,count=0,n,t=0,te=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=1;j<=(a[i]/2);j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			count++;
			b[i]=count;
			//System.out.println(a[i]+" - "+b[i]);
			count=0;
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(b[j]<b[j+1])
				{
					t=a[j];
					te=b[j];
					a[j]=a[j+1];
					b[j]=b[j+1];
					a[j+1]=t;
					b[j+1]=te;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}	
		sc.close();
	}

}
