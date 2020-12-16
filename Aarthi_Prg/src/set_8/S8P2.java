package set_8;

import java.util.Arrays;
import java.util.Scanner;

public class S8P2 
{

	public static void main(String[] args) 
	{
		int[] arr;
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		j=n-1;
		for(i=0;i<n/2;i++)
		{
			System.out.print(arr[j]+" "+arr[i]);
			if(i!=(n/2-1))
				System.out.print(" ");
			j--;
		}
		if(n%2!=0)
		{
			System.out.println(" "+arr[i]);
		}
		sc.close();

	}

}
