package SatClass;

import java.util.Scanner;

public class Transpose 
{

	public static void main(String[] args)
	{
	
		int i,j,k,l,m,n;
		int[][] a;
		int[][] b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m");
		m=sc.nextInt();
		//n=sc.nextInt();
		a=new int[m][m];
		System.out.println("Entre the elements :");
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
			
				
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		
		
	}

}
