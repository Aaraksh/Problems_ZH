package set_8_on;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class S8_P1 
{
	static int max=1000;
	static int fac[];
	public static void genval()
	{
		int i,j;
		fac[1]=1;
		for(i=2;i<max;i++)
		{
			if(i%2==0)
				fac[i]=2;
			else
				fac[i]=i;
		}
		for(i=3;(i*i)<max;i++)
		{
			if(fac[i]==i)
			{
				for(j=i;j<max;j+=i)
				{
					fac[j]=i;
				}
			}
		}
	}
	public static int count(int n)
	{
		int c=1,ans=1,du=fac[n];
		int j=n/fac[n];
		while(j!=1)
		{
			if(fac[j]==du)
			{
				c+=1;
			}
			else
			{
				du=fac[j];
				ans=ans*(c+1);
				c=1;
			}
			j=j/fac[j];
				
		}
		ans=ans*(c+1);
		return ans;
	}
	
	public static void sortval(HashMap<Integer, Integer> hmap)
	{
		List<Map.Entry<Integer, Integer>> li=new LinkedList<Map.Entry<Integer,Integer>>(hmap.entrySet());
		Collections.sort(li, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		//System.out.println("IN");
		for(Entry<Integer, Integer>hh:li)
		{
			System.out.print(hh.getKey()+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> hmap=new HashMap<Integer,Integer>();
		int[] a;
		int i,n;
		fac=new int[1000];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		genval();
		for(i=0;i<n;i++)
		{
			hmap.put(a[i], count(a[i]));
		}
		sortval(hmap);
		sc.close();

	}

}
