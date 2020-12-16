package SatClass;

import java.util.Scanner;

public class MaxSubArray 
{

	public static void main(String[] args) 
	{
		String s1,ss="";
		String[] str;
		char[]a;
		//int[] b;
		int i,j=0,k=0,n,c=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s1=sc.nextLine();
		n=s1.length();
		a=new char[n];
		a=s1.toCharArray();
		str=new String[n];
		char[][] num1=new char[n][n];
		int[][] num2=new int[n][n];
		//str[0]="";
		for(i=0;i<n;i++)
		{
			
			k=i;
			//System.out.println("in: ");
			while(c<3)
			{
				ss=ss+a[k];
				//str[j]=str[j]+a[k];
				
				
				k++;
				c++;
				if(k==n)
				{
					k=0;
				}
				//j++;
				
			}
			c=0;
			str[j]=ss;
			ss="";
			System.out.println("string: "+str[j]);
			j++;
			System.out.println(" jvalue: "+j);
			//str[j]="";
		}
		
		
		sc.close();		
	}

}
