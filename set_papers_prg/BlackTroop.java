package set_papers_prg;

import java.util.Scanner;

public class BlackTroop
{

	public static void main(String[] args) 
	{
		int i,j,c=0,row,col,max=0,max1=0;
		int[] in1;
		int[] in2;
		int[][] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		row=sc.nextInt();
		System.out.println("Enter the col size: ");
		col=sc.nextInt();
		a=new int[row][col];
		in1=new int[row];
		in2=new int[col];
		System.out.println("Enter the array elements: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]==1)
					c++;
			}
			in1[i]=c;
			if(c>max)
				max=c;
			c=0;
		}
		c=0;
		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)
			{
				if(a[j][i]==1)
					c++;
					
			}
			in2[i]=c;
			if(c>max1)
				max1=c;
			c=0;
		}
		int mid1 = row/2;
		int mid2=col/2;
		for(i=0;i<row;i++)
		{
			if(in1[i]==max)
				a[i][mid1]=0;
				
		}
		for(i=0;i<col;i++)
		{
			if(in2[i]==max1)
				a[mid2][i]=0;
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
