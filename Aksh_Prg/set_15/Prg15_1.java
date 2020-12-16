package set_15;

import java.util.Scanner;

public class Prg15_1 
{

	public static void main(String[] args) 
	{
		int i,j,n,max=0,minmax=Integer.MAX_VALUE;
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the values of an array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag;
		for(i=0;i<n;i++)
		{
			flag=0;
			System.out.print(arr[i]+">");
			for(j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(arr[i]<arr[j])
					{
						max=arr[j];
						if(minmax>max)
						{
							minmax=max;
							flag=1;
						}					
					}
				}
			}
			if(flag==1)
				System.out.print(minmax);
			if(i<n-1)
				System.out.print(",");
			minmax=Integer.MAX_VALUE;
		}
		sc.close();

	}

}
