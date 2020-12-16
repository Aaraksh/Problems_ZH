package set_17;

import java.util.Arrays;
import java.util.Scanner;

public class Prg17_4
{

	public static void main(String[] args) 
	{
		int[] a;	
		int i,k=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			while( (i+1)<n && a[i]==a[i+1] )
			{
				k++;
				i++;
			}
			System.out.println(a[i]+" - "+k);
			k=1;
		}
		sc.close();
	}

}
