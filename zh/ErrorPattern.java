package zh;

import java.util.Scanner;

public class ErrorPattern
{

	public static void main(String[] args)
	{
		int i,j,k,c,n,f,len;
		String s;
		char[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		len=s.length();
		if(len%2==0)
		{
			s="#"+s;
			len+=1;
		}
		n=c=len/2;
		a=s.toCharArray();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<len;j++)
			{
				for(k=0;k<c ;k++)
				{
					System.out.print(" ");
					//System.out.print(j);
					j++;
				}
				if(j<len)
					System.out.print(a[j]);
			}
			c--;
			System.out.println();
		}
		sc.close();
	}

}
