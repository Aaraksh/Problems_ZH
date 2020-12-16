package hackerrank;

import java.util.Scanner;

public class SelectionSort 
{

	public static void main(String[] args)
	{
		int i,j,n,t;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			
			for(j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();

	}

}
