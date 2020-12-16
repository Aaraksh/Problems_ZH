package leet_Code;

import java.util.Scanner;

public class Searchrotate 
{
	public static int solve(int[] a,int n,int key)
	{
		int p=pivot(a,0,n-1);
		if(p==-1)
			return binary(a,0,n-1,key);
		if(a[p]==key)
			return p;
		if(a[0]<key)
			return binary(a,0,p-1,key);
		return binary(a,p+1,n-1,key);
	}
	public static int pivot(int[] a,int l,int r)
	{
		int mid;
		if(r<l)
			return -1;
		if(l==r)
			return r;
		mid=(l+r)/2;
		if(mid>l && a[mid]>a[mid+1])
			return mid;
		if(mid>l && a[mid]<a[mid]-1)
			return mid-1;
		if(a[l]>=a[mid])
			return pivot(a,l,mid-1);
		return pivot(a,mid+1,r);
	}
	public static int binary(int[] a,int l,int r,int key)
	{
		int mid;
		mid=(l+r)/2;
		if(r<l)
			return -1;
		if(a[mid]==key)
			return mid;
		if(a[mid]>=key)
			return binary(a,l,mid-1,key);
		return binary(a,mid+1,r,key);
	}
	public static void main(String[] args) 
	{
		int i,n,key,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the values of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key value to find: ");
		key=sc.nextInt();
		res=solve(a,n,key);
		System.out.println(res);
		sc.close();

	}

}
