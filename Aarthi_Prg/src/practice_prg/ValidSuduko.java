package practice_prg;

public class ValidSuduko 
{
	static int n=9;
	public static boolean solve(int[][] a,int r,int c)
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
		{
			if(safe(a,r,c,a[r][c]))
				solve(a,r,c+1);
			else
				return false;
		}
		else
		{
			solve(a,r,c+1);
		}
		return true;
	}
	public static boolean safe(int[][] a,int r,int c,int num)
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
	public static void main(String[] args)
	{
		int a[][]={ { 8, 0, 7, 6, 5, 4, 3, 2, 1 }, 
                { 2, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 3, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 4, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 5, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 6, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 7, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                { 9, 0, 0, 0, 0, 0, 0, 0, 0 } }; 
		if(solve(a,0,0))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
