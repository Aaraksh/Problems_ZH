package set_4;

import java.util.Scanner;

public class S4P6
{

	public static void main(String[] args) 
	{
		int row,col,flag=1,i,j,m=0,n=0,s=0,t=0;
		char[][] arr;
		char ch='X';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		row=sc.nextInt();
		System.out.println("Enter the column size: ");
		col=sc.nextInt();
		arr=new char[row][col];
		n=row;
		m=col;
		while(n>0 && m>0)
		{
			for(i=s;i<m;i++)
				arr[s][i]=ch;
			t++;
			
			for(i=t;i<n;i++)
				arr[i][m-1]=ch;
			m--;
			for(i=m;i>=s;i--)
				arr[n-1][i]=ch;
			n--;
			
			for(i=n;i>=t;i--)
				arr[i][s]=ch;
			s++;
			
			flag++;
			if(flag%2==0)
				ch='O';
			else
				ch='X';
			
		}
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
