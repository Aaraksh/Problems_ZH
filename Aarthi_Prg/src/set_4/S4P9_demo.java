package set_4;

import java.util.Scanner;

public class S4P9_demo 
{

	public static void main(String[] args) 
	{
		int n1,n2,len,i,j=0,sum,r,m=0;
		int[] a;
		int[] b;
		int[] c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array 1: ");
		n1=sc.nextInt();
		a=new int[n1];
		System.out.println("Enter the elements of an array 1: ");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the length of an array 2: ");
		n2=sc.nextInt();
		b=new int[n2];
		c=new int[n1*n2];
		System.out.println("Enter the elements of an array 2: ");
		for(i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		len=(n1<n2)?n1:n2;
		for(i=0;i<len;i++)
		{
			sum=a[i]+b[i];
			System.out.print("sum: "+sum);
			if(sum>=10)
			{
				while(sum>0)
				{
					r=sum/10;
					c[j]=r;
					m=sum%10;
					sum=r;
					j++;
				}
				c[j]=m;
				j++;
			}
			else
			{
				c[j]=sum;
			}
		}
		if(n1>n2)
		{
			for(int k=n2;k<n1;k++)
			{
				c[j]=a[k];
				j++;
			}
		}
		if(n2>n1)
		{
			for(int k=n1;k<n2;k++)
			{
				c[j]=b[k];
				j++;
			}
		}
		
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		sc.close();
	}

}
