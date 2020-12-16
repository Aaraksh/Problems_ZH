package zoho_interview;

import java.util.Scanner;

public class EqIndex 
{

	public static void main(String[] args) 
	{
		int n,i,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=0,r;
		System.out.println("Equilibrium indexes: ");
	    for(i=0;i<n;i++)
		{
			int k=i+1;
			l=0;r=0;
			for(j=0;j<n && k<n;j++)
			{
				
				if(j<i)
				{
					l+=a[j];
				}
				else
				{
					r+=a[k];
					k++;
				}
			}
			if(l==r)
				System.out.println(i);
		}
		
		sc.close();

	}

}
