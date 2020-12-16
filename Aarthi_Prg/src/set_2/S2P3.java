package set_2;

import java.util.Scanner;

public class S2P3
{
	
	public static void numseries(int n)
	{
		int i,j,si,m;
		for(i=0;i<n;i++)
		{
			String[] a=new String[i+1];
			si=1;
			m=1;
			a[0]="";
			
			while(si<=i)
			{
				for(j=0; j<m && (j+si)<=i;j++)
					a[si+j]="3"+a[si-m+j];
				
				for(j=0;j<m && (j+si+m)<=i;j++)
					a[si+m+j]="4"+a[si-m+j];
				
				m*=2;
				si=si+m;
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		int n;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value: ");
		s=sc.next();
		if(s.matches("[0-9]+"))
		{
			n=Integer.parseInt(s);
			numseries(n);
		}
		else
		{
			System.out.println("Invalid input!!");
		}
		sc.close();
	}

}
