package practice_zh;

import java.util.Scanner;

public class RatMaze
{
	static int n;
	
	public void print(int[][] ans,int[][] a)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(ans[i][j]==1)
					System.out.print('_'+" ");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public boolean safe(int[][] a,int x,int y)
	{
		if(x>=0 && x<n && y>=0 && y<n && a[x][y]==1)
			return true;
		
		return false;
	}
	
	public boolean solve(int[][] a,int x,int y,int[][] ans)
	{
		if(x==n-1 && y==n-1)
		{
			ans[x][y]=1;
			return true;
		}
		else if(safe(a,x,y))
		{	
			ans[x][y]=1;
			if(solve(a,x+1,y,ans))
				return true;
			if(solve(a,x,y+1,ans))
				return true;
			ans[x][y]=0;
			return false;
		}
		ans[x][y]=0;	
		return false;
	}

	public static void main(String[] args) 
	{
		int[][] a;
		int[][] ans;
		int i,j;
		Scanner sc=new Scanner(System.in);
		RatMaze ra=new RatMaze();
		System.out.println("Enter the vaue of n: ");
		n=sc.nextInt();
		a=new int[n][n];
		ans=new int[n][n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
				ans[i][j]=0;
			}
		}
		if(!ra.solve(a,0,0,ans))
		{
			System.out.println("No path exists!!");
		}
		else
			ra.print(ans, a);
		sc.close();

	}

}
