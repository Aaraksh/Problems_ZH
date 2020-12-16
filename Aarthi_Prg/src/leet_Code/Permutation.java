package leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutation 
{
	
	public static void swap(int[] a,int l,int r,List<List<Integer>> res)
	{
		int t;
		t=a[r];
		a[r]=a[l];
		a[l]=t;
		List<Integer> li=new ArrayList<>();
		for(int b:a)
		{
			li.add(b);
		}
		if(!res.contains(li))
			res.add(li);
	}
		public static void perm(int[] a,int l,int r,List<List<Integer>> res)
	{
		int i;
		if(l!=r)
		{
			for(i=l;i<=r;i++)
			{
				swap(a,l,i,res);
				perm(a,l+1,r,res);
				swap(a,l,i,res);
			}
		}
		//return res;
	}
	public static void permute(int[] a)
	{
		int l=0,r=a.length-1;
	    List<List<Integer>> res=new ArrayList<>();
	    if(a.length==0)
            res.add(new ArrayList<>());
	    else if(a.length==1)
	    {
	    	List<Integer> aa=new ArrayList<>();
	    	aa.add(a[0]);
	    	res.add(aa);
	    }
		perm(a,l,r,res);
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		permute(a);
	}

}
