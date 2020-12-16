package SatClass;

import java.util.Arrays;
import java.util.Scanner;

//Given a set of 'N' elements,you have sort those in descending and place them in the order like Mid position,Mid-1,Mid+1,Mid-2,Mid+2 and so on.

public class MixUp
{

	public static void main(String[] args)
	{
		int i=1,j=2,k,s=0,n,mid=0,mid1=0;
		int[] a;
		int[] b;
		int[] c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		System.out.println("Enter the array elements: ");
		for(k=0;k<n;k++)
		{
			a[k]=sc.nextInt();
		}
		Arrays.sort(a);
		for(k=n-1;k>=0;k--)
		{
			b[s]=a[k];
			s++;
		}
		a=b;
		
		for(k=0;k<n;k++)
		{
			System.out.println(a[k]+" "+b[k]);
		}
		mid=n/2;
		int m = mid;
		mid1=mid;
		c[mid]=a[0];
		while(i<n)
		{
			c[--mid]=a[i];
			i+=2;
		}
		while(j<n)
		{
			c[++mid1]=a[j];
			j+=2;
		}
		System.out.print("output:");
		for(i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
