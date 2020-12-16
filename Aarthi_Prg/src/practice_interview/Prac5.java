package practice_interview;

import java.util.Scanner;

public class Prac5 
{

	public static void main(String[] args) 
	{
		int i,j,row,col,m=0,n=0,s,t,flag=1;
		char ch='X';
		char[][] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		row=sc.nextInt();
		System.out.println("Enter the column size: ");
		col=sc.nextInt();
		a=new char[row][col];
		s=row;
		t=col;
		while(m<row && n<col)
		{
			for(i=m;i<t;i++)
			{
				a[m][i]=ch;
			}
			m++;
			for(i=m;i<s;i++)
			{
				a[i][t-1]=ch;
			}
			t--;
			for(i=t-1;i>=n;i--)
			{
				a[s-1][i]=ch;
			}
			s--;
			for(i=s-1;i>=m;i--)
			{
				a[i][n]=ch;
			}
			n++;
			
			ch=(flag%2==0)?'X':'O';
			flag++;
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
