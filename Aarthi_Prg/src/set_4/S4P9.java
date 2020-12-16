package set_4;

import java.util.Scanner;

public class S4P9 
{

	public static void main(String[] args) 
	{
		int l1,l2,n1,n2,i,j=0,sum,ca=0,r;
		int[] a;
		int[] b;
		int[] c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array1: ");
		n1=sc.nextInt();
		a=new int[n1];
		System.out.println("Enter the elements of an array1: ");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array2: ");
		n2=sc.nextInt();
		b=new int[n2];
		System.out.println("Enter the elements of an array2: ");
		for(i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		c=new int[n1*n2];
		l1=n1-1;
		l2=n2-1;
		while(l1>=0 && l2>=0)
		{
			sum=a[l1]+b[l2]+ca;
			r=sum%10;
			c[j++]=r;
			ca=sum/10;
			l1--;
			l2--;
		}
		if(n1==n2)
		{
			if(ca!=0)
			{
				c[j++]=ca;
			}
		}
		if(n1>n2)
		{
			for(i=(n1-n2-1);i>=0;i--)
			{
				sum=ca+a[i];
				r=sum%10;
				c[j++]=r;
				ca=sum/10;
			}
			if(ca!=0)
			{
				c[j++]=ca;
			}
		}
		if(n2>n1)
		{
			for(i=(n2-n1-1);i>=0;i--)
			{
				sum=ca+b[i];
				c[j++]=sum%10;
				ca=sum/10;
			}
			if(ca!=0)
			{
				c[j++]=ca;
			}
		}
		for(i=j-1;i>=0;i--)
		{
			System.out.print(c[i]+" ");
		}
		sc.close();
		
	}

}
