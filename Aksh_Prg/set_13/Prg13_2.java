package set_13;

import java.util.Scanner;

public class Prg13_2
{

	public static void main(String[] args) 
	{
		int row,n,i,j,flag,s=0,k=0,m;
		int[][] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		row=sc.nextInt();
		if(row%2 ==0)
		{
			a=new int[row][row];
			n=row;
			m=row;
			flag=row;
			while(s<=row/2 && k<=row/2)
			{
				for(i=s;i<m;i++)
					a[s][i]=flag;
				k++;
				for(i=k;i<m;i++)
					a[i][m-1]=flag;
				n--;
				for(i=n-1;i>=s;i--)
					a[n][i]=flag;
				m--;
				for(i=m-1;i>=k;i--)
					a[i][s]=flag;
				s++;
				
				flag--;
				
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<row;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

			sc.close();
		}
		
		
	}

}
