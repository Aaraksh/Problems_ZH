package practice_prg;

import java.util.Scanner;

public class RatMaze 
{
	public static void print(int[][] a,int n1,int n2)
	{
		int i,j;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(a[i][j]==1)
					System.out.println("("+i+"->"+j+")");
					
			}
		}
	}
	public static boolean safe(int[][] a,int[][] sol,int n1,int n2,int x,int y,int p1,int p2)
	{
		if(x>=0 && x<n1 && y>=0 && y<n2 && x==p1 && y==p2 && a[x][y]==1)
		{
			return true;
		}
		return false;
	}
	public static boolean find(int[][] a, int[][] sol, int n1, int n2, int x, int y, int p1, int p2)
	{
		if(x>=0 && x<n1 && y>=0 && y<n2 && a[x][y]==1)
		{
			sol[x][y]=1;
			return true;
		}
		if(safe(a,sol,n1,n2,x,y,p1,p2)==true)
		{
			sol[x][y]=1;
			if(find(a,sol,n1,n2,x+1,y,p1,p2)==true)
				return true;
			if(find(a,sol,n1,n2,x-1,y,p1,p2)==true)
				return true;
			if(find(a,sol,n1,n2,x,y+1,p1,p2)==true)
				return true;
			if(find(a,sol,n1,n2,x,y-1,p1,p2)==true)
				return true;
			
			sol[x][y]=0;
			return false;
		}
		return false;
	}
	public static boolean solve(int[][] a,int n1,int n2,int x,int y,int p1,int p2)
	{
		int[][] sol=new int[n1][n2];
		int i,j;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				sol[i][j]=0;
			}		
		}
		if(find(a,sol,n1,n2,x,y,p1,p2)==false)
		{
			System.out.println("No path exists");
			return false;
		}
		
		print(a, n1, n2);
		return true;
	}

	public static void main(String[] args) 
	{
		int i,j,p1,p2,x,y,n1,n2;
		int a[][]= {{0,0,1,1,0},{0,1,0,1,0},{1,0,1,1,0},{0,0,1,1,1},{0,0,1,1,0}};
		Scanner sc=new Scanner(System.in);
		n1=a.length;
		n2=a[0].length;
		System.out.println("Enter the start position: ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Enter the end position: ");
		p1=sc.nextInt();
		p2=sc.nextInt();
		solve(a,n1,n2,x,y,p1,p2);

	}

}
