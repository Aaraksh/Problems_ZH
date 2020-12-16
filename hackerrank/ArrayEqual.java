package hackerrank;

import java.util.Scanner;

public class ArrayEqual 
{

	public static void main(String[] args) 
	{
		int[] a;
		int n,i,k,key = 0,flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			k=a[i];
			//System.out.println(k+" "+i);
			while(k%2==0)
			{
				k/=2;
			}
			while(k%3==0)
			{
				k/=3;
			}
			if(i==0)
			{
				key=k;
			}
			System.out.println(k);
			if(key!=k)
			{
				//System.out.println("In "+k+" "+key);
				flag=0;
				//return;
			}
			//System.out.println(k+" "+i);
		}
		if(flag==0)
			System.out.println("No");
		else
			System.out.println("Yes");
		sc.close();
	}

}
