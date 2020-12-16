package set_15;

import java.util.Scanner;

public class Prg15_4 
{
	static int n,m,in;
	public static boolean safe(char[][] arr,int x,int y,char ch)
	{
		if(x>=0 && x<n && y>=0 && y<m && arr[x][y]==ch)
		{
			return true;
		}
		return false;
	}
	public static boolean solve(char[][] arr,int x,int y,String key)
	{
		
		if((x==arr[0].length-1 && y==arr.length) || key.length()==in)
		{
			return true;
		}
		if(safe(arr,x,y,key.charAt(in))==true)
		{
			in++;
			if(solve(arr,x+1,y,key)==true)
				return true;
			if(solve(arr,x,y+1,key)==true)
				return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		int i,j,l;
		char arr[][];
		String[] key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and the column size of an char array: ");
		n=sc.nextInt();
		m=sc.nextInt();
		arr=new char[n][m];
		System.out.println("Enter the values of an array: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				arr[i][j]=sc.next().charAt(0);
			}
		}
		System.out.println("Enter the number of keys to check: ");
		l=sc.nextInt();
		key=new String[l];
		System.out.println("Enter the value for "+l+" keys: ");
		for(i=0;i<l;i++)
		{
			key[i]=sc.next();
		}
		int ff=0;
		while(ff<l)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(key[ff].charAt(0)==arr[i][j])
					{
						in=0;
						if(solve(arr,i,j,key[ff])==true)
							System.out.println(key[ff]);
					}
				}
			}
			ff++;
		}
		sc.close();
	}

}
