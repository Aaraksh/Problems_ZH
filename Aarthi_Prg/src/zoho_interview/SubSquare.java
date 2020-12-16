package zoho_interview;

import java.util.Scanner;

public class SubSquare 
{

	public static void main(String[] args) 
	{
		int i,j,m,n,k,t,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		int[][] a=new int[n][n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Key: ");
		k=sc.nextInt();
		if(k>=0 && k<=n)
		{
			for(i=0;i<n-k+1;i++)
			{
				for(j=0;j<n-k+1;j++)
				{
					sum=0;
					for(m=i;m<k+i;m++)
					{
						for(t=j;t<k+j;t++)
						{
							sum+=a[m][t];
						}
					}
					System.out.print(sum+" ");
				}
			}
		}
		sc.close();

	}

}
