package set_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prg23_3 
{

	public static void main(String[] args) 
	{
		int n,i;
		Integer[] a;
		Scanner sc=new Scanner( System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new Integer[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		for(i=0;i<n;i++)
		{
			if(i+1<n)
			{
				if(!(a[i]==a[i+1]))
				{
					System.out.println("Second maximum element in an array: "+a[i+1]);
					break;
				}
			}
			else if((i-1)>=0)
			{
				if(a[i]==a[i-1])
					System.out.println("No second maximum element present.");
			}
			else
			{
				System.out.println("No second maximum element present.");
			}
		}
		sc.close();
	}

}
