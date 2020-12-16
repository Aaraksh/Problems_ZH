package set_papers_prg;

import java.util.Scanner;

public class RatMaze 
{
	static int n;

	public void print(int[][] ans)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Way to reach the destination: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(ans[i][j]==1)
				{	
					
					
					System.out.print(i+"->"+j);
					if(i==n-1 && j==n-1)
						System.out.print("");
					else
						System.out.print("->");
				}
				
			}
		}
	}
	public boolean safe(int[][] rat,int x,int y)
	{
		if(x>=0 && x<n && y>=0 && y<n && rat[x][y]==1)
			return true;
		return false;
	}
	public boolean solve(int[][] rat,int x,int y,int[][] ans)
	{
		if(x==n-1 && y==n-1)
		{	
			ans[x][y]=1;
			return true;
		}
		if(safe(rat,x,y)==true)
		{
			ans[x][y]=1;
			if(solve(rat,x+1,y,ans))
				return true;
			if(solve(rat,x,y+1,ans))
				return true;
			ans[x][y]=0;
			return false;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int[][] rat;
		int[][] ans;
		int i,j;
		Scanner sc=new Scanner(System.in);
		RatMaze rr=new RatMaze();
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		rat=new int[n][n];
		ans=new int[n][n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				rat[i][j]=sc.nextInt();
				ans[i][j]=0;
			}
		}
		if(rr.solve(rat,0,0,ans)==false)
			System.out.println("No way to reach the destination!!");
		else
			rr.print(ans);
		sc.close();
			
			

	}

}
