package SatClass;

import java.util.Scanner;

//=================Program to check odd number present in the odd index and even number present in the even index===========
public class SortedHat
{

	public static void main(String[] args) 
	{
		int i=1,j=0,t1=0,t2=0,n,k;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(k=0;k<n;k++)
		{
			a[k]=sc.nextInt();
		}
		while(true)
		{
		
			while(i<n && a[i]%2==0)
			{
				i=i+2;	
			}
	
			while(j<n && a[j]%2==1)
			{
				j=j+2;
				
			}
			if(i<n && j<n)
			{
				//System.out.println("Loop in");
				t1=a[i];
				a[i]=a[j];
				a[j]=t1;
			}
			else
				break;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]);
			
		sc.close();
	}

}
