package set_36;

import java.util.Scanner;

public class Prg36_4 
{

	public static void main(String[] args) 
	{
		int i,n,j,l=0,t;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if((i+1)<n)
			{
				if(a[i] == a[i+1])
				{
					a[i]= a[i]*2;
					a[i+1]=0;
				}
			}
			
			for(int k=0;k<=i;k++)
			{
				for(j=k;j<=i;j++)
				{
					if(a[j]==0)
					{
						l=j;
						j++;
						while(j<=i && (a[j]==0))
						{
							/*t=a[l];
							a[l]=a[j];
							a[j]=t;*/
							j++;
						}
						if(j<=i)
						{
							t=a[l];
							a[l]=a[j];
							a[j]=t;
						}
					}
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
