package set_papers_prg;

import java.util.Scanner;

public class Application 
{
	int n=10;
	public void disp(int[][] res,int[][] a)
	{
		int i,j,k,c=0;
		for(i=0;i<n && c==0;i++)
		{
			for(j=0;j<n && c==0;j++)
			{
				
				
				if(res[i][j]==1)
				{
					
					//wormhole(i,j,res,a);
					System.out.print("("+i+"->"+j+")");
					if(j<n-1)
					{
						//System.out.print("->");
					}
					for(k=0;k<10;k++)
					{
						if(a[i][k]==10)
						{
							System.out.println("("+i+"->"+k+")");
							c++;
							break;
						}
						else if(a[k][j]==10)
						{
							System.out.println("("+k+"->"+j+")");
							c++;
							break;
						}
					}
				}
				//if(i==n-1 && j==n-1)
					//System.out.print("");
				
			}
			
		}
	}
	public void wormhole(int i,int j,int[][] res,int[][] a)
	{
		if(i>1 && i<n-1 && j>0 && j<n-1 && a[i][j-1]==0 && a[i][j+1]==0)
		{
			res[i][j]=-1;
		}
	}
	public boolean solve(int[][] a,int x,int y,int[][] res)
	{
		if(x==n-1 && y==n-1)
		{
			res[x][y]=1;
			return true;
		}
		
		if(path(a,x,y)==true)
		{
			res[x][y]=1;
			if(solve(a,x+1,y,res))
				return true;
			if(solve(a,x,y+1,res))
				return true;
			
			res[x][y]=0;
			return false;
		}
		
		return false;
			
	}
	
	public boolean path(int[][] a,int x,int y)
	{
		if(x>0 && x<n && y>0 && y<n && (a[x][y]==1  || a[x][y]==10))
		{
			return true;
		}
		return false;
	}
	public void clear(int[][] res)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				res[i][j]=0;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int i,r,c,j,count=0;
		int[][] res=new int[10][10];
		int[][] a= {{1,1,1,1,1,1,1,1,1,1},
		            {0,0,0,1,0,0,0,1,0,0},
		            {0,0,0,1,1,0,1,10,0,0},
		            {0,0,0,0,1,0,0,1,0,0},
		            {0,0,0,0,1,0,0,1,1,1},
		            {0,0,0,0,1,1,0,0,0,1},
		            {0,0,0,0,0,1,0,0,0,1},
		            {0,0,0,0,0,1,0,0,0,1},
		            {0,0,0,0,0,1,0,0,0,1},
		            {1,1,1,1,1,1,1,1,1,1}};
		Scanner sc=new Scanner(System.in);
		Application aa=new Application();
		for(i=0;i<10;i++)
		{
			if(a[1][i]==1)
			{
				System.out.println("AAAAA");
				r=1;
				c=i;
				if((aa.solve(a,r,c,res)==true))
				{
					System.out.println("path exists:");
					aa.disp(res,a);
					//count++;
					for(int m=0;m<10;m++)
					{
						for(int p=0;p<10;p++)
						{
							System.out.print(res[m][p]+" ");
						}
						System.out.println();
					}
				}				
				aa.clear(res);
				
			}
		}
		

	}

}
