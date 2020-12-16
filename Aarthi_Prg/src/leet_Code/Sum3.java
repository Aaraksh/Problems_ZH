package leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Sum3 
{
	public static List<List<Integer>> findsum(int[] ar)
	{
		int i,l,r,c,sum=0;
		
		List<List<Integer>> li=new ArrayList<>();
		int n=ar.length;
		//System.out.println(n);
		Arrays.sort(ar);
		for(i=0;i<n-2;i++)
		{
			if(i==0 || (i>0 && ar[i]!=ar[i-1])) // Giving this condition becoz if the taken number is same as previous it might result in duplicate set
			{
				c=i;
				l=i+1;
				r=n-1;
				while(l<r)
				{
					List<Integer> s = new ArrayList<>();
					//System.out.println(c+" "+l+" "+r);
					sum=ar[c]+ar[l]+ar[r];
					if(sum==0)
					{
						s=Arrays.asList(ar[c],ar[l],ar[r]);
						//s.add(ar[l]);
						//s.add(ar[r]);
						if(!li.contains(s))
							li.add(s);
						l++; r--;
					}
					else if(sum<0)
						l++;
					else
						r--;
				}
			}
		}
		return li;
	}
	public static void main(String[] args) 
	{
		int i,n;
		int[] ar;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		List<List<Integer>> li=new ArrayList<List<Integer>>();
		li=findsum(ar);
		System.out.println(li);
		sc.close();
	}

}
