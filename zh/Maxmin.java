package zh;

import java.util.Scanner;

public class Maxmin
{

	
	public static void main(String[] args) 
	{
	
		int max=0,min=0,leaf=0,n,i,l,r;
		int[] a=new int[25];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		System.out.println("Enter the value of array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			
			l=(2*i)+1;
			r=(2*i)+2;
			if(l<n && r<n)
			{
				if(a[i]>a[l] && a[i]>a[r])
				{
					max++;
				}
				else if(a[i]<a[l] && a[i]<a[r])
				{
					min++;
				}
				else
				{
					continue;
				}
				
			}
			else
			{
				leaf++;
			}
		}
		
		System.out.println("max= "+max);
		System.out.println("min= "+min);
		System.out.println("leaf= "+leaf);
		sc.close();

	}

}
