package zh;

import java.util.Scanner;

public class ZigZag
{
 
	static int k;
	
	public static void main(String[] args)
	{
	
		int n,i,j=0,c=0;
		int[][] a= new int[50][50];
		int[] b=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix size n :");
		n=sc.nextInt();
		System.out.println("Enter the value of matrix elements: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{
			if(k==0)
			{
				if(i%2==0)
				{
					for(j=k;j<n;j++,k++)
					{
						b[c]=a[i][j];
						c++;
					}
				
					i=i+1;
					b[c]=a[i][j-1];
					//System.out.println("dummy"+b[c]);
					c++; 
				
				}
				k--;
				//System.out.println(" Value of k is:"+k);
			}
			
			else if(k==n-1)
			{
				if(i%2==0)
				{
					for(j=k;j>=0;j--,k--)
					{
						b[c]=a[i][j];
						c++;
						
					}
				
					i=i+1;
					b[c]=a[i][j+1];
					c++;
					k++;
				}
			}
		}
		
		for(i=0;i<c-1;i++)
		{
			System.out.println("ZigZag elements are: "+b[i]);
		}
		
		

	}

}
