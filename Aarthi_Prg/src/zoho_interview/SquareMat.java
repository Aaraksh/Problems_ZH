package zoho_interview;

import java.util.Scanner;

public class SquareMat 
{

	public static void main(String[] args) 
	{
		int i,j,n,k;
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
		k=n-1;
		if(n==1)
			System.out.println(a[0][0]);
		else
		{
			i=0;
			while(i==0 && k>=0)
			{
				System.out.print(a[i][k--]+" ");
			}
			for(j=i+1;j<n-1;j++)
			{
				System.out.print(a[j][j]+" ");
				i++;
			}
			k=n-1;
			while(j==n-1 && k>=0)
			{
				System.out.print(a[j][k--]+" ");
			}
			
		}
		sc.close();

	}

}
