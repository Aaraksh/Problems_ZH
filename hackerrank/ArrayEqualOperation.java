package hackerrank;

import java.util.Scanner;

public class ArrayEqualOperation
{

	public static void main(String[] args) 
	{
		int k,n,i,flag=1,key,sum=0,c=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Enter the value of k: ");
		k=sc.nextInt();
		key=(sum+k)/2;
		for(i=0;i<n;i++)
		{
			if(k>0)
			{
				c=key-a[i];
				a[i]=a[i]+c;
				k=k-c;
			}
			if(k<0 && i<(n-1))
				flag=0;
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("-1");
		
		sc.close();
	}

}
