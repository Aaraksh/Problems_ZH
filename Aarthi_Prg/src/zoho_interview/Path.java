package zoho_interview;

import java.util.Scanner;

public class Path 
{
	static int[][] sol;
	public static boolean solve(int[][] a,int n,int x,int y,int e1,int e2)
	{
		sol=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sol[i][j]=0;
			}
		}
		return findpath(a,n,sol,x,y,e1,e2);
	}
	public static boolean findpath(int[][] a,int n,int[][] sol,int x,int y,int e1,int e2)
	{
		//System.out.println("In"+x+" "+y);
		if(x>=0 && x<n && y>=0 && y<n && x==e1 && y==e2 && a[x][y]==1)
		{
			sol[x][y]=1;
			return true;
		}
		if(check(a,sol,n,x,y,e1,e2))
		{   
			System.out.println("Find: "+x+" "+y);
			sol[x][y]=1;
			//System.out.println();
			if(findpath(a,n,sol,x+1,y,e1,e2)==true)
			{
				System.out.println("In1: "+x+" "+y);
				return true;
			}
			if(findpath(a,n,sol,x,y+1,e1,e2)==true)
			{
				System.out.println("In2: "+x+" "+y);
				return true;
			}
			if(findpath(a,n,sol,x-1,y,e1,e2)==true)
			{
				System.out.println("In3: "+x+" "+y);
			    return true;
			}
			/*if(findpath(a,n,sol,x-1,y,e1,e2)==true)
			{
				System.out.println("In3: "+x+" "+y);
			    return true;
			}*/
			if(findpath(a,n,sol,x,y-1,e1,e2)==true)
			{
				System.out.println("In4: "+x+" "+y);
				return true;
			}
		
			sol[x][y]=0;
			return false;
		}
		//sol[x][y]=0;
		return false;	
	}
	public static boolean check(int[][] a,int[][] sol,int n,int x,int y,int e1,int e2)
	{
		
		if(x>=0 && x<n && y>=0 && y<n && a[x][y]!=0)
		{
			return true;		
		}	
		return false;   //1 1 1 0 0 0 1 1 0 0 1 1 1 1 1 1
	}

	public static void printsol(int[][] sol,int n,int x,int y,int e1,int e2)
	{
		for(int i=x;i<n;i++)
		{
			int k=(i==x)?x:0;
			for(int j=k;j<n;j++)
			{
				if(sol[i][j]==1)
					System.out.println("("+i+","+j+")");				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int i,j,l,s1,s2,e1,e2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		l=sc.nextInt();
		int[][] a=new int[l][l];
		System.out.println("Enter elements: ");
		for(i=0;i<l;i++)
		{
			for(j=0;j<l;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the start index: ");
		s1=sc.nextInt();
		s2=sc.nextInt();
		System.out.println("Enter the end index: ");
		e1=sc.nextInt();
		e2=sc.nextInt();
		boolean res=solve(a,l,s1,s2,e1,e2);
		if(res)
			printsol(sol,l,s1,s2,e1,e2);
		else
			System.out.println("No path exists!");
		sc.close();
	}

}
//1 1 1 0 1 0 0 1 1 0 0 0 1 1 1 1 1 0 1 1 1 1 0 0 1