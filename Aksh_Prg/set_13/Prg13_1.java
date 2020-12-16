package set_13;

import java.util.Scanner;

public class Prg13_1
{

	public static void main(String[] args) 
	{
		int i,max=Integer.MIN_VALUE,n;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				System.out.print(max+" ");
			}
		}
		sc.close();

	}

}
