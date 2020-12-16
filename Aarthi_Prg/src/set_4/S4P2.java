package set_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class S4P2
{
	static int fac[];
	static int max=10000;
	public static void genfac()
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
		for(i=3;i*i<max;i++)
		{
			if(fac[i]==i)
			{
				for(j=i*i;j<max;j+=i)
				{
					if(fac[j]==j)
						fac[j]=i;
				}
			}
		}
	}
	
	public static int factor(int n)
	{
		int c=1;
		int ans=1,du=fac[n];
		int j=n/fac[n];
		if(n==1)
			return 1;
		while(j!=1)
		{
			if(fac[j]==du)
				c+=1;
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
	
	public static void sortval(HashMap<Integer, Integer> hm)
	{
		List<Map.Entry<Integer, Integer>> lis=new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
		Collections.sort(lis, new Comparator<Map.Entry<Integer, Integer>>()
		{

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
			{
				return(o2.getValue()).compareTo(o1.getValue());  //Indescending order
				//return(o1.getValue()).compareTo(o2.getValue()); //In ascending order
			}
		});
		HashMap<Integer, Integer> res=new LinkedHashMap<>();
		for(Entry<Integer, Integer> a:lis)
		{
			res.put(a.getKey(), a.getValue());
		}
		System.out.println("Factors in descending order: "+res);
	}
	
	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> hm=new HashMap<>();
		int arr[];
		int n,i;
		fac=new int[max];
		fac[0]=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of an array:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		genfac();
		for(i=0;i<n;i++)
		{
			hm.put(arr[i], factor(arr[i]));
		}
		System.out.println(hm);
		sortval(hm);
		sc.close();
	}

}
