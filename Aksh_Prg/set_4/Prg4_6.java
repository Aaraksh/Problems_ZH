package set_4;

import java.util.Scanner;

public class Prg4_6 
{
	public static void pattern(int row,int col)
	{
		int i,c=1,s=0,k=0,n,m;
		char flag='X';
		char[][] arr=new char[row][col];
		n=row;
		m=col;
		while(s<n && k<m)
		{
			if(c%2==0)
				flag='0';
			else
				flag='X';
			
			for(i=s;i<m;i++)
			{
				arr[s][i]=flag;
				//System.out.print(flag);
			}
			
			k++;
			for(i=k;i<n;i++)
			{
				arr[i][n-1]=flag;
				//System.out.print(flag);
			}
			
			//s++;
			m--;
			
			for(i=m;i>=s;i--)
			{
				arr[m][i]=flag;
				//System.out.print(flag);''''''''''''
			}
			
			n--;
			
			for(i=n;i>=s;i--)
			{
				arr[i][s]=flag;
				//System.out.print(flag);
			}
			
			s++;
			
			c++;
		}
		for(i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the row: ");
		row=sc.nextInt();
		System.out.println("Enter the column size: ");
		col=sc.nextInt();
		pattern(row,col);
		sc.close();

	}

}
