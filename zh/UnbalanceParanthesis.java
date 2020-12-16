package zh;

import java.util.Scanner;

public class UnbalanceParanthesis 
{

	public static void main(String[] args) 
	{
	
		String s1;
		char[] a;
		int i,j,c=0,l;
		int[] t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s1=sc.next();
		l=s1.length();
		t=new int[l];
		a=s1.toCharArray();
		for(i=1;i<l-1;i++)
		{
			if(a[i]=='(')
			{
				t[c]=i;
				c++;
			}
			if(a[i]==')')
			{
				if(c!=0)
					c--;
				else
				{
					t[c]=i;
					c++;
				}
			}
			
		}
		System.out.print("\nString with Balanced Paranthesis: ");
		for(i=0;i<l;i++)
		{
			int flag=0;
			for(j=0;j<c;j++)
			{
				if(i==t[j])
					flag=1;		
			}
			if(flag!=1)
			{
				System.out.print(a[i]);
			}
		}

	}

}
