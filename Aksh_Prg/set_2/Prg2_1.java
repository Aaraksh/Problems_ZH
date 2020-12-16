package set_2;

import java.util.Arrays;
import java.util.Scanner;

public class Prg2_1
{

	public static void main(String[] args) 
	{
		int n,i,m1=0,m2=0;
		int arr[]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		m2=n-1;
		arr=new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		while(m1<m2)
		{
			System.out.print(arr[m2]+" ");
			System.out.print(arr[m1]+" ");
			m2--;
			m1++;
		}
		if((n%2)!=0)
		{
			System.out.print(arr[m2]);
		}
		

	}

}
