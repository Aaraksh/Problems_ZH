package leet_Code;

import java.util.Scanner;

public class RegMatch 
{
	public static boolean matchpat(String s,String p)
	{
		int sl,pl,i,j;
		sl=s.length();
		pl=p.length();
		boolean[][] ma=new boolean[sl+1][pl+1];
		ma[0][0]=true;
		char[] ss=s.toCharArray();
		char[] pp=p.toCharArray();
		
		for(i=1;i<ma[0].length;i++)
		{
			if(pp[i-1]=='*')
			{
				ma[0][i]=ma[0][i-2];
			}
		}
		
		for(i=1;i<ma.length;i++)
		{
			for(j=1;j<ma[0].length;j++)
			{
				if(pp[j-1]=='.' || ss[i-1]==pp[j-1])
				{
					ma[i][j]=ma[i-1][j-1];
				}
				else if(pp[j-1]=='*')
				{
					ma[i][j]=ma[i-1][j-2];
					if(ss[i-1]==pp[j-2]  || pp[j-2]=='.')
					{
						ma[i][j]= ma[i][j] | ma[i-1][j];
					}
				}
				else
				{
					ma[i][j]=false;
				}
			}
		}
		return ma[sl][pl];
	}

	public static void main(String[] args) 
	{
		String s,reg;
		boolean res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		System.out.println("Enter the regular expression: ");
		reg=sc.next();
		res=matchpat(s, reg);
		System.out.println(res);
		sc.close();
	}

}
