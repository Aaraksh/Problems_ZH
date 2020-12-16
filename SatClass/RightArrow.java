package SatClass;

import java.util.Scanner;

public class RightArrow 
{

	public static void main(String[] args) 
	{
	
		String ss;
		char[] a;
		int i,j,k,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.next();
		n=ss.length();
		StringBuffer st=new StringBuffer(ss);
		if(n%2==0)
		{	
			st.insert(n/2,'#');
		}
		ss=st.toString();
		a=ss.toCharArray();
		for(i=0;i<=n/2;i++)
		{
			k=i;
			for(j=0;j<=i;j++)
			{
				System.out.print(a[k]+" ");
				k++;
			}
			System.out.println();
		}
		//System.out.println("/////////"+((n/2)+1));
		c=n/2;
		for(i=((n/2)+1);i<=n;i++)
		{
			k=i;
			for(j=0;j<c;j++)
			{
				System.out.print(a[k]+" ");
				k++;
			}
			c--;
			System.out.println();
		}
			
	/*	a=ss.toCharArray();
		for(i=0;i<=n/2;i++)
		{
			k=i;
			for(j=0;j<=i;j++)
			{
				System.out.print(a[k]+" ");
				k++;
			}
			System.out.println();
		}
		//System.out.println("/////////"+((n/2)+1));
		c=n/2;
		for(i=((n/2)+1);i<n;i++)
		{
			k=i;
			for(j=0;j<c;j++)
			{
				System.out.print(a[k]+" ");
				k++;
			}
			c--;
			System.out.println();
		}                                    */
		sc.close();

	}

}
