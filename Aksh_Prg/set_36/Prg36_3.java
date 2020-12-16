package set_36;

import java.util.Scanner;

public class Prg36_3 
{

	public static void main(String[] args) 
	{
		int i,j,k,l=1,m=1,s=2,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			l=m;
			for(j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(l+" " );
				l--;
			}
			m=m+s;
			s++;
			System.out.println();
		}
		l=m-s+1;
		m=l;
		s-=2;
		//System.out.println(l+" "+s);
		for(i=0;i<n;i++)
		{
			l=m;
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<(n-i);k++)
			{
				//System.out.print(n-i+1);
				System.out.print(l+" ");
				l--;
			}
			m=m-s;
			s--;
			System.out.println();
		}
		sc.close();
	}

}
