package hash_prg;

import java.util.HashMap;
import java.util.Scanner;

public class MinDistArr 
{
	public static void finddist(int n,int[] a)
	{
		HashMap<Integer, Integer> hmap=new HashMap<>();
		int i,prev=0,curr=0,min=Integer.MAX_VALUE;
		for(i=0;i<n;i++)
		{
			if(hmap.containsKey(a[i]))
			{
				prev=hmap.get(a[i]);
				curr=i;
				min=Math.min(curr-prev, min);
			}
			hmap.put(a[i], i);
		}
		min=(min==Integer.MAX_VALUE)?-1:min;
		System.out.println("Minimum distance between an array: "+min);
		
	}
	public static void main(String[] args) 
	{
		int[] a;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

	}

}
