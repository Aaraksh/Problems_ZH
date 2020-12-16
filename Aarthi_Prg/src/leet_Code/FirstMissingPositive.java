package leet_Code;

import java.util.Scanner;

public class FirstMissingPositive 
{
	public static int findneg(int[] a,int n)
	{
		int i,j=0,t;
		for(i=0;i<n;i++)
		{
			if(a[i]<=0)
			{
				t=a[j];
				a[j]=a[i];
				a[i]=t;
				j++;
			}
		}
		return j;
	}
	
	public static int findmiss(int[] a,int n)
	{
		int i,f;
		for(i=0;i<n;i++)
		{
			f=Math.abs(a[i]);
			if(f-1<n && a[f-1]>0)
			{
				a[f-1]=-a[f-1];
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
				return i+1;
		}
		return n+1;
	}
	
	public static void main(String[] args) 
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int r=findneg(a,n);
		int arr[]=new int[n-r];
		j=0;
		for(i=r;i<n;i++)
		{
			arr[j++]=a[i];
		}
		int res=findmiss(arr,j);
		System.out.println("First Missing Positive number is: "+res);
		sc.close();

	}

}
