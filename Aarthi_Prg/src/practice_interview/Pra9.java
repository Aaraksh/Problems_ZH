package practice_interview;

import java.util.Scanner;

public class Pra9
{

	public static void main(String[] args) 
	{
		int i,j,n;
		char[] a1,a2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a1=new char[n];
		a2=new char[n];
		System.out.println("Enter "+n+" characters of array1: ");
		for(i=0;i<n;i++)
		{
			a1[i]=sc.next().charAt(0);
		}
		System.out.println("Enter "+n+" characters of array2: ");
		for(i=0;i<n;i++)
		{
			a2[i]=sc.next().charAt(0);
		}
		
		for(i=0;i<n;i++)
		{
			if(a1[i]!=a2[i])
			{
				if((i+1)<n && (a1[i+1]!=a2[i+1]))
				{
					System.out.println(a1[i]+""+a2[i]);
					System.out.println(a1[i+1]+""+a2[i+1]);
					i++;
				}
				else
				{
					System.out.println(a1[i]+","+a2[i]);
				}
			}
		}
		

	}

}
