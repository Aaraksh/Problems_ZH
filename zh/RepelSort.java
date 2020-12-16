package zh;

import java.util.Arrays;
import java.util.Scanner;

public class RepelSort 
{

	public static void main(String[] args) 
	{
		int[] a;
		
		int n,i,m1,m2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		if(n>=1)
		{
		a=new int[n];
		
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		m1=n/2;
		m2=n/2+1;
		System.out.print(a[m1]+" ");
		m1--;
		while(m1>=0 && m2<n)
		{
			System.out.print(a[m1]+" "+a[m2]+" ");
			m1--;
			m2++;
		}
		while(m1>=0)
		{
			System.out.print(a[m1]+" ");
			m1--;
		}
		while(m2<n)
		{
			System.out.print(a[m2]+" ");
			m2++;
		}
		}
		sc.close();
	}

}
