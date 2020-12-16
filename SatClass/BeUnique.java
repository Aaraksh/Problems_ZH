package SatClass;

import java.util.Scanner;

public class BeUnique
{

	public static void main(String[] args) 
	{
	
		int i,j,k,n,flag=1;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]++;
					while(flag==1)
					{
						flag=0;
						for(k=0;k<n;k++)
						{
							if(k!=j && a[k]==a[j])
							{
								a[j]++;
								flag=1;
							}
						}
						
						
					}
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
