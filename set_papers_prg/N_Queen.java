package set_papers_prg;

import java.util.Scanner;

public class N_Queen 
{
	static int n;
	
	public void print(int[][] a)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public boolean safe(int[][] a,int row,int col)
	{
		int i,j;
		for(i=0;i<col;i++)
		{
			if(a[row][i]==1)
				return false;
		}
		for(i=row,j=col;i>=0 && j>=0;i--,j--)
		{
			if(a[i][j]==1)
				return false;
		}
		for(i=row,j=col;i<n && j>=0;i++,j--)
		{
			if(a[i][j]==1)
				return false;
		}
		return true;
	}
	{
		
	}
	
	public boolean nqueen(int a[][],int col)
	{
		int i;
		if(col>=n)
			return true;
		else
		{
			for(i=0;i<n;i++)
			{
				if(safe(a,i,col)==true)
				{
					a[i][col]=1;
					if(nqueen(a, col+1))
						return true;
					
					a[i][col]=0;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) 
	{
		//int[][] a= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		//static int n;
		int i,j;
		int[][] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		n=sc.nextInt();
		a=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=0;
			}
		}
		
		N_Queen nn=new N_Queen();
		//ans=nn.nqueen(a, 0);
		if(nn.nqueen(a, 0)==false)
			System.out.println("Solution doesnot exists!!");
		else
			nn.print(a);
		sc.close();
	}

}
