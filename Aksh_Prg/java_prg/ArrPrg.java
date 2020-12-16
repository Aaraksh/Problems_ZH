package java_prg;

import java.util.Scanner;

public class ArrPrg 
{

	public static void main(String[] args) 
	{
		int i,sum=0;
	/*	int[] a= {1,2,3,4,5};
		for(i=0;i<5;i++)
			System.out.println(a[i]);	*/
		
		int[]a=new int[5];
		Scanner sc=new Scanner(System.in);
		int len;
		len=a.length;
		System.out.println("Length: "+len);
		System.out.println("Enter the array elements: ");
		for(i=0;i<5;i++)
			a[i]=sc.nextInt();
		
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
