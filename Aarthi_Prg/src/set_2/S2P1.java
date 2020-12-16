package set_2;

import java.util.Arrays;
import java.util.Scanner;

public class S2P1 
{
	public static void sort(int[] arr,int n)
	{
		Arrays.sort(arr);
		int m1=0;
		int m2=n-1;
		while(m1<m2)
		{
			System.out.print(arr[m2]+" ");
			System.out.print(arr[m1]+" ");
			m2--;
			m1++;
		}
		if(n%2 !=0)
			System.out.println(arr[m1]);
	}

	public static void main(String[] args) 
	{
		int n,i;
		String s;
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		s=sc.next();
		if(s.matches("[0-9]+"))
		{
			n=Integer.parseInt(s);
			arr=new int[n];
			System.out.println("Enter the elements of an array: ");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			sort(arr,n);
			
		}
		else
		{
			System.out.println("Enter the valid number!!");
		}
		sc.close();

	}

}
