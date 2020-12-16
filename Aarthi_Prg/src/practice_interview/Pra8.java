package practice_interview;

import java.util.Scanner;

public class Pra8 
{

	public static void main(String[] args) 
	{
		int m=0,n=0,s,t,row,col,i,j,num,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to start: ");
		num=sc.nextInt();
		row=col=num+(num-1);
		f=num;
		s=t=row;
		int[][] arr=new int[row][row];
		while(m<f)
		{
			for(i=m;i<t;i++)
			{
				arr[m][i]=num;		
			}
			m++;
			
			for(i=m;i<s;i++)
			{
				arr[i][t-1]=num;
			}
			t--;
			for(i=t-1;i>=n;i--)
			{
				arr[s-1][i]=num;
			}
			s--;
			for(i=s-1;i>=m;i--)
			{
				arr[i][n]=num;
			}
			n++;
			num--;
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
