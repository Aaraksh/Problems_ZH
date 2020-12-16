package SatClass;

import java.util.Scanner;



public class Zapper 
{

	public static void main(String[] args)
	{
		String s;
		char[] a;
		int flag=0,i,j,co=0,c=0,len,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		len=s.length();
		n=len;
		
		if(len%2==0)
		{
			s="#"+s;
			len++;
			n=len;
		}
		a=new char[n];
		a=s.toCharArray();
		for(i=1;i<=n/2+1;i++)
		{
			//System.out.println(len);
			c=i%n;
			//System.out.println("*");
			for(j=i;j<=n/2;j++)
			{
				System.out.print(" ");
				co++;
			}
			flag=0;
			for(k=co;k<n && flag<c;k++)
			{
				System.out.print(a[k]);
				k++; 
				System.out.print(" ");
				flag++;
			}
			co=0;
			System.out.println();
		}
		
		c=0; co=0; flag=0;
		
		for(i=n/2;i>=1;i--)
		{
			c=i%n;
			for(j=i;j<=n/2;j++)
			{
				System.out.print(" ");
				co++;
			}
			flag=0;
			for(k=co;k<n && flag<c;k++)
			{
				System.out.print(a[k]);
				k++; 
				System.out.print(" ");
				flag++;
			}
			co=0;
			System.out.println();
			
		}
		sc.close();
	}

}
