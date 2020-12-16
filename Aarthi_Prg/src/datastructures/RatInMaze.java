package datastructures;

import java.util.Scanner;

public class RatInMaze 
{
	static int n1,n2;
	
	public static boolean check(int x,int y)
	{
		if(x<n1 && y<n2 && x>=0 && y>=0)
			return true;
		return false;
	}
	public static boolean safe(int[][] a,int[][] vi,int x,int y)
	{
		if(a[x][y]==0 || vi[x][y]==1)
			return false;
		return true;
	}
	public static int find(int[][] a,int[][] v,int s,int t,int x,int y,int min,int d)
	{
		if(s==x && t==y)
		{
			printsol(v);
			return Math.min(min, d);
		}
		
		v[s][t]=1;
		if(check(s+1,t) && safe(a,v,s+1,t))
			min=find(a,v,s+1,t,x,y,min,d+1);
		if(check(s,t+1) && safe(a,v,s,t+1))
			min=find(a,v,s,t+1,x,y,min,d+1);
		if(check(s-1,t) && safe(a,v,s-1,t))
			min=find(a,v,s-1,t,x,y,min,d+1);
		if(check(s,t-1) && safe(a,v,s,t-1))
			min=find(a,v,s,t-1,x,y,min,d+1);
		
		v[x][y]=0;
		return min;
	}
	public static void printsol(int[][] v)
	{
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(v[i][j]==1)
				{
					System.out.print("("+i+","+j+")");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int i,j,s,t,x,y,dis=0;
		int[][] a =
			{
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 0, 0, 0, 1, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
			};
		Scanner sc=new Scanner(System.in);
		n1=a.length;
		n2=a[0].length;
		
		int[][] v=new int[n1][n2];
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				v[i][j]=0;
			}
		}
		System.out.println("Enter the Start position: ");
		s=sc.nextInt();
		t=sc.nextInt();
		System.out.println("Enter the End Position: ");
		x=sc.nextInt();
		y=sc.nextInt();
		int res=find(a,v,s,t,x,y,Integer.MAX_VALUE,dis);
		System.out.println(res);
		if(res!=Integer.MAX_VALUE)
			System.out.println("MAx Length: "+res);
		else
			System.out.println("No path exists:");
		sc.close();

	}

}
