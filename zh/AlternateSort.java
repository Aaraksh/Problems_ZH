package zh;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort 
{

	public static void main(String[] args) 
	{
	
		int i=0,j=0,n;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the value of array elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		i=0;
		j=n-1;
		for(int k=0;k<n/2;k++)
		{
			if(i<j)
			{
				System.out.println(a[j]);
				System.out.println(a[i]);
				i++;
				j--;
			}
		}
		if(n%2!=0)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
