package zh;

import java.util.Scanner;

public class MinMax 
{

	public static void main(String[] args) 
	{
		int n,i,j,k,min=0,max=Integer.MIN_VALUE;
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
		System.out.println("Enter the size of subset: ");
		k=sc.nextInt();
		for(i=0;i<n;i+=k)
		{
			min=Integer.MAX_VALUE;
			for(j=i;j<(i+k) && j<n;j++)
			{
				if(min>a[j])
					min=a[j];
			}
			//System.out.println(min);
			if(max<min)
				max=min;
		}
		System.out.println(max);
		sc.close();

	}

}
