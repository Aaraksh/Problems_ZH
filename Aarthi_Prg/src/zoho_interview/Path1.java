package zoho_interview;

import java.util.Arrays;
import java.util.Scanner;

public class Path1 
{
	static int c;
	public static void printsol(int[] a,int n)
	{
		System.out.println(n);
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void findsum(int[] a,int[] sol,int r,int s,int e,int in,int key)
	{
		System.out.println("Value of r: "+r );
		if(r==in)
		{
			c++;
			System.out.println(c);
			
			printsol(a,r);
		}
		if(c==r)
		{
			printsol(a,r);
		}
		
		for(int i=s;i<=e && e-i+1>=r-in;i++)
		{
			sol[in]=a[s];
			c++;
			findsum(a,sol,r,i+1,e,in+1,key);
		}
		//findsum(a,sol,r,s++,e,0,key);
		
	}
	public static void main(String[] args) 
	{
		int n,i=0,j,rem,l,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		System.out.println("Enter the largest num to find: ");
		l=sc.nextInt();
		int[] a=new int[11];
		while(n>0)
		{
			rem=n%10;
		    a[i++]=rem;
		    n/=10;
		}
		Arrays.sort(a,0,i);
		int[] sol=new int[i];
		int k=0;
		len=i;
		if(l==1)
			printsol(a,i);
		else
			findsum(a,sol,len,0,len,0,l);
		for(i=0;i<l-1;i++)
		{
			k=l%2;
			if(k==0)
				for(j=0;j<=k+2;j++)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			else
				for(j=0;j<=i+1;j++)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
		}
		//printsol(a,len);
		sc.close();
	}

}
