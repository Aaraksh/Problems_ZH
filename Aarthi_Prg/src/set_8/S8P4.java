package set_8;

import java.util.Scanner;

public class S8P4
{

	public static void main(String[] args) 
	{
		char[] a1;
		char[] a2;
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of characters: ");
		n=sc.nextInt();
		a1=new char[n];
		a2=new char[n];
		System.out.println("Enter the "+n+" characters of array1: ");
		for(i=0;i<n;i++)
		{
			a1[i]=sc.next().charAt(0);
		}
		System.out.println("Enter the "+n+" characters of array2: ");
		for(i=0;i<n;i++)
		{
			a2[i]=sc.next().charAt(0);
		}
		for(i=0;i<n;i++)
		{
			if(!(a1[i]==a2[i]))
			{
				System.out.println(a1[i]+","+a2[i]+" ");
			}
		}
		sc.close();

	}

}
