package set_papers_prg;

import java.util.Scanner;

public class NumberWeight
{

	public int perfect(int num)
	{
		int f;
		double s;
		s=Math.sqrt(num);
		f=(int) Math.floor(s);
		s=s-f;
		if(s==0)
			return 5;
		else
			return 0;
		
	}
	public static void main(String[] args)
	{
		NumberWeight nu=new NumberWeight();
		int i,n,j=0,k,sum=0,t1,t2;
		int[] a;
		int[] b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=nu.perfect(a[i]);
			if(a[i]%4==0 && a[i]%6==0)
				sum=sum+4;
			if(a[i]%2==0)
				sum=sum+3;
			
			b[j]=sum;
			j++;		
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(b[j]<b[j+1])
				{
					t1=b[j];
					t2=a[j];
					b[j]=b[j+1];
					a[j]=a[j+1];
					b[j+1]=t1;
					a[j+1]=t2;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" "+b[i]);
		}
		

	}

}
