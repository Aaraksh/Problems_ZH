package leet_Code;

import java.util.Scanner;

public class IndPos 
{
	public static int[] find(int[] a,int key)
	{
		int i=0,l,r,n,f1=0,f2=0;
		int[] s=new int[2];
		s[0]=-1;
		s[1]=-1;
		n=a.length;
		l=0;
		r=n-1;
		while(l<=r && i<n)
		{
			if(a[l]==key && f1==0)
			{
				System.out.println();
				s[0]=l;
				f1=1;
				//l++;
			}
			else if(f1!=0)
			  l++;
			if(a[r]==key && f2==0)
			{
				s[1]=r;
				f2=1;
				
			}
			else if(f2!=0)
			  r--;
			i++;
		}
		return s;
	}

	public static void main(String[] args) 
	{
		int n,i,key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		int[] res=new int[2];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		key=sc.nextInt();
		res=find(a,key);
		System.out.println("["+res[0]+" "+res[1]+"]");
		sc.close();
	}

}
