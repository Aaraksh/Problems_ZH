package zh;

import java.util.Scanner;

public class AnticlockSpiral 
{

	public static void main(String[] args)
	{
	
		int i,j,k=0,s=0,m,n,row,col,num=1;
		int a[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the row count: ");
		row=sc.nextInt();
		System.out.println("Enter the column count: ");
		col=sc.nextInt();
		a=new int[row][col];
		n=row;
		m=col;
		while(k<n && s<m)
		{
			for(i=k;i<n;i++)
			{
				a[i][k]=num++;
				//System.out.println(a[i][k]);
			}
			k++;
			for(i=k;i<m;i++)
			{
				a[n-1][i]=num++;
				System.out.println(a[n-1][i]);
			}
			n--;
			for(i=n-1;i>=s;i--)
			{
				a[i][m-1]=num++;
				//System.out.println(a[i][m-1]);
			}
			m--;
			for(i=m-1;i>=k;i--)
			{
				a[s][i]=num++;
				//System.out.println(a[s][i]);
			}
			s++;  
		}
		System.out.println("Output Pattern: \n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}    
		sc.close();
	}

}
