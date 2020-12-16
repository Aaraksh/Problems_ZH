package leet_Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber 
{
	public static void singlenum(int[] a)
	{
		int l,i,j,ans,c=0,n;
		HashMap<Integer, Integer> m=new HashMap<>();
		n=a.length;
		for(i=0;i<n;i++)
		{
			if(!m.containsKey(a[i]))
			{
				m.put(a[i], 1);
			}
			else
			{
				//get(a[i]);
				m.put(a[i], m.get(a[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> h:m.entrySet())
		{
			if(h.getValue()==1)
			{
				c=h.getKey();
				break;
			}
		}
		System.out.println(c);
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
		{
			a[i]=sc.nextInt();
		}
		singlenum(a);
		sc.close();

	}

}
