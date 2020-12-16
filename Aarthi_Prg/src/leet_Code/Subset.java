package leet_Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset 
{
	public static void findsub(int[] a)
	{
		List<List<Integer>> res=new ArrayList<>();
		int i,j,n;
		n=a.length;
		for(i=0;i<Math.pow(2, n);i++)
		{
			List<Integer> li=new ArrayList<>();
			for(j=0;j<n;j++)
			{
				if((i & (int)Math.pow(2, j))>0)
				{
					li.add(a[j]);
				}
			}
			if(!res.contains(li))
			{
				res.add(li);
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		findsub(a);
		sc.close();
	}

}
