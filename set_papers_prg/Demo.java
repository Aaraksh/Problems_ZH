package set_papers_prg;

import java.util.Scanner;

public class Demo
{

	public static void main(String[] args)
	{
		int i,j,k,n,c1=0,c2=0;
		int[][] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n: ");
		n=sc.nextInt();
		if(n>=1)
		{
			a=new int[n][n];
			
			System.out.println("Enter the array elements: ");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the size of consecutive 1's to be present: ");
			k=sc.nextInt();
			int mid = n/2;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(a[i][j]==0)
					{
						c1=0;
					}
					else
					{
						c1++;
						if(c1==k)
						{
							
							a[i][mid]=0;
							
						}
					}
					
					if(a[j][i]==0)
					{
						c2=0;
					}
					else
					{
						c2++;
						if(c2==k)
						{
							
							a[mid][j]=0;
							
						}
					}
				}
				c1=0;c2=0;
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}		
		sc.close();

	}

}
