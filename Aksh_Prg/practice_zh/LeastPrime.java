package practice_zh;

import java.util.Scanner;

public class LeastPrime
{
	static boolean[] pr=new boolean[1001];
    static
	{
		int i;
		
		for(i=0;i<1001;i++)
		{
			pr[i]=true;
		}
		pr[0]=false;
		pr[1]=false;
		for(i=2;i<1001;i++)
		{
			if(pr[i]==true)
			{
				for(int j=i*i;j<=1000;j+=i)
				{
					pr[j]=false;
				}
			}
		}
		
	}
	
	public static int check(int n,int mod)
	{
		//System.out.println(mod+" "+n);
		int i=mod;
		while(pr[i]==false)
		{
			i++;
		}
		return i;
	}
	
	public static void main(String[] args) 
	{
		int n1,n2,i,r,mod;
		int[] a;
		int[] b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1: ");
		n1=sc.nextInt();
		a=new int[n1];
		System.out.println("Enter the elements of array 1: ");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array 2:");
		n2=sc.nextInt();
		b=new int[n2];
		System.out.println("Enter the elements of array 2: ");
		for(i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		if(n1==n2)
		{
			for(i=0;i<n1;i++)
			{
				r=a[i]%b[i];
				mod=b[i]-r;
				int res=check(n1,mod);
				System.out.println(res+" ");
			}
		}

	}

}
