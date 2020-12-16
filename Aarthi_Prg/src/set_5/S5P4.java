package set_5;

import java.util.Scanner;

public class S5P4 
{
	public static void rotate(int[][] a,int row,int col)
	{
		int m=0,n=0,prev,curr,i,r,c;
		r=row;
		c=col;
		while(m<row && n<col)
		{
			if((m+1)==row || (n+1)==col)
				break;
			
			prev=a[m+1][n];
			
			for(i=n;i<col;i++)
			{
				curr=a[m][i];
				a[m][i]=prev;
				prev=curr;
			}
			m++;
			
			for(i=m;i<row;i++)
			{
				curr=a[i][col-1];
				a[i][col-1]=prev;
				prev=curr;
			}
			col--;
			
			if(m<row)
			{
				for(i=(col-1);i>=n;i--)
				{
					curr=a[row-1][i];
					a[row-1][i]=prev;
					prev=curr;	
				}
			}
			row--;
			
			if(n<col)
			{
				for(i=row-1;i>=m;i--)
				{
					curr=a[i][n];
					a[i][n]=prev;
					prev=curr;
				}
			}
			n++;		
		}
		
		for(i=0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int row,col,i,j;
		int[][] a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		row=sc.nextInt();
		System.out.println("Enter the column size: ");
		col=sc.nextInt();
		a=new int[row][col];
		System.out.println("Enter the Array elements: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		rotate(a,row,col);
		sc.close();
	}

}
