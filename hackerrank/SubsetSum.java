package hackerrank;

import java.util.Scanner;

public class SubsetSum
{

	public static void main(String[] args) 
	{
		int n,k,i,curr=0,start=0,flag=0,c=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of the array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum value to find: ");
		k=sc.nextInt();
		curr=a[0];
		start=a[c];
		for(i=1;i<n;i++)
		{
			if(curr==k )
			{
				System.out.println("The sum is found between the indexes "+c+" "+i);
				flag=1;
				break;
			}
			
			if(curr<k)
			{
				curr=curr+a[i];
				//System.out.println("Curr: "+curr);
			}
			if(curr>k)
			{
				
				curr=curr-start;
				start=a[++c];	
				i--;
			}
			
			
		}
		if(flag==0)
		{
			System.out.println("No Subarray found..!!");
		}
		sc.close();
	}

}
