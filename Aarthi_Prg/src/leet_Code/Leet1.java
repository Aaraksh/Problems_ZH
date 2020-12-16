package leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Leet1 
{
	public static int[] findindex(int[] a,int key)
	{
		int i,j,len=0,flag=1;
		len=a.length;
		int[] arr=new int[len];
		for(i=0;i<len && flag==1;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if((a[i]+a[j])==key)
				{
					arr[0]=i;
					arr[1]=j;
					flag=0;
					break;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		int i,j,n,len,key;
		int[] a;
		int[] ans=new int[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		key=sc.nextInt();
		ans=findindex(a,key);
		if(ans != null)
		{
			ArrayList<Integer> arr=new ArrayList<Integer>();			
			for(i=0;i<2;i++)
			{
				arr.add(ans[i]);
			}
			System.out.println(arr);
		}
		

	}

}
