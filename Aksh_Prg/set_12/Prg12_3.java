package set_12;

import java.util.Scanner;

public class Prg12_3 
{
	static int count;
	public static void main(String[] args) 
	{
		int i,j,k,n;
		int[] a;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the threshold value: ");
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			j=a[i];
			while(j>=k)
			{
				j=j-k;
				count++;
			}
			if(j>0)
				count++;
		}
		System.out.println("Result:"+count);
		sc.close();

	}

}
