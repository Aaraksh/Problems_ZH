package SatClass;

import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args)
	{
	
		int n1,n2,m1,m2,i,j,k,l;
		int[][] a;
		int[][] b;
		
		int[][] c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m and n for matrix a");
		m1=sc.nextInt();
		n1=sc.nextInt();
		a=new int[m1][n1];
		System.out.println("Enter the matrix elements: ");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the m and n values for matrix b");
		m2=sc.nextInt();
		n2=sc.nextInt();
		b=new int[m2][n2];
		System.out.println("Enter the matrix elements: ");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		c=new int[m1][n2];
		if(n1==m2)
		{
			for(i=0;i<m1;i++)
			{
				for(j=0;j<n2;j++)
				{
					for(k=0;k<m1;k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
						System.out.println("c==  "+c[i][j]);
					}
				}
			}
		}
		else
		{
			System.out.println("row and column are not equal: ");
		}
		System.out.println("OutPut: ");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
