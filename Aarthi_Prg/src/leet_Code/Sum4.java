package leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum4 
{
	public static void findsum(int[] a,int key)
	{
		int i,j,m,n,l,r,len,sum=0;
		len=a.length;
		Arrays.sort(a);
		List<List<Integer>> res=new ArrayList<>();
		for(i=0;i<len-3;i++)
		{
			if(i!=0 && a[i]==a[i-1])
				continue;
			for(j=i+1;j<len-2;j++)
			{
				if(j!=(i+1) && a[j]==a[j-1])
					continue;
				
				l=j+1;
				r=len-1;
				while(l<r)
				{
					sum=a[i]+a[j]+a[l]+a[r];
					if(sum<key)
						l++;
					else if(sum>key)
						r--;
					else
					{
						res.add(Arrays.asList(a[i],a[j],a[l],a[r]));
						l++;
						r--;
						while(l<r && a[l]==a[l-1])
							l++;
						while(l<r && a[r]==a[r+1])
							r--;
					}
					
							
				}
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		int i,n,key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value to find: ");
		key=sc.nextInt();
		findsum(a,key);
		sc.close();

	}

}
