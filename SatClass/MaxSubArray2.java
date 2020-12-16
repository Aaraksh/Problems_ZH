package SatClass;

import java.util.Scanner;

public class MaxSubArray2 
{

	public static void main(String[] args) 
	{
		int[] a;
		int[][] b;
		int n,i,j=0,k=0,c=0,sum=0,max=0,index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n][n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value of c: ");
		c=sc.nextInt();
		for(i=0;i<n;i++)
		{
			k=i;
			for(j=0;j<c;j++)
			{
				b[i][j]=a[k];
				sum=sum+b[i][j];
				k++;
				if(k==n)
				{
					k=0;
				}
			}
			if(sum>max)
			{
				max=sum;
				index=i;
			}
			sum=0;
		}
		System.out.println("Possible subarrays: ");
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Maximum Sum: "+max);
		System.out.print("Array elements are: ");
		for(i=0;i<c;i++)
		{
			System.out.print(b[index][i]+" ");
		}
		sc.close();
	}

}
