package practice_prg;

import java.util.Scanner;

public class Sudoko 
{
	static int n=9;
	
	static boolean solve(int[][] a,int r,int c)
	{
		if(r==n-1 && c==n)
		{
			return true;
		}
		if(c==n)
		{
			r++;
			c=0;
		}
		if(a[r][c]!=0)
			return solve(a,r,c+1);
		for(int num=1;num<10;num++)
		{
			if(safe(a,r,c,num))
			{
				a[r][c]=num;
				if(solve(a,r,c+1))
					return true;
			}
			a[r][c]=0;
		}
		return false;
	}
	
	static boolean safe(int[][] a,int r,int c,int num)
	{
		int i,j,sr,sc;
		for(i=0;i<=8;i++)
		{
			if(a[r][i]==num)
				return false;
		}
		for(i=0;i<=8;i++)
		{
			if(a[i][c]==num)
				return false;
		}
		sr=r-r%3;
		sc=c-c%3;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i+sr][j+sc]==num)
					return false;
			}
		}
		return true;
	}
	public static void printsol(int[][] a)
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
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[][]={ { 5, 0, 6, 3, 0, 8, 4, 0, 0 }, 
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } }; 
		
		if(solve(a,0,0))
			printsol(a);
		else
			System.out.println("No solution exists");
		sc.close();
	}

}
