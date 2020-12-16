package set_4;

import java.util.Scanner;

public class S4P7 
{
	
	public static void findgrp(int[] a,int key)
	{
		int sum=0,c=0,i,j,gp=0;
		int len=a.length;
		for(i=2;i<Math.pow(2, len);i++)
		{
			for(j=0;j<len;j++)
			{
				if((i & (1<<j))>0)
				{
					sum=sum+a[j];
					c++;
					System.out.print(a[j]+" ");
				}
			}
			if(c>1 && c<=key)
			{
				if(sum%key==0)
				{
					System.out.println(" = "+sum);
					gp++;
				}
			}
			c=0;
			sum=0;
		}
		System.out.println("Number of groups: "+gp);
		
	}
	public static void main(String[] args) 
	{
		int n,key,i;
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the keyvalue: ");
		key=sc.nextInt();
		findgrp(arr,key);
		sc.close();

	}

}
