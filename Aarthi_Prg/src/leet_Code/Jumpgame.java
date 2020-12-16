package leet_Code;

import java.util.Scanner;

public class Jumpgame 
{

	public static void main(String[] args) 
	{
		int n,i,j,ju=0,t = 0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n>0)
		{
			ju=0;
			t=1;
			while(t<n && a[t]!=0)
			{
				if(t==n-1)
				{
					System.out.println("True");
					k=1;
				}
				t=t+a[ju];
				ju=t;
			}
		}
		if(t==n-1)
			System.out.println("True");
		if(k==0 && t!=n-1)
			System.out.println("False");
	

	}

}
