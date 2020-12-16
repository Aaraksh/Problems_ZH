package SatClass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Roger 
{

	public static void main(String[] args) 
	{
	
		String ss,ss1;
		String[] sa;
		int i,j=0,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		ss=sc.nextLine();
		ss1=ss;
		//StringTokenizer st=new StringTokenizer(ss1, " ");
		if(ss1.indexOf("  ")>0)
		{
			j++;
		}
		
		if(j!=0)
		{
			System.out.println("Error");
		}
			
		else
		{
			sa=ss.split(" ");
			int n=sa.length;
			for(i=n-1;i>=0;i--)
			{
					System.out.print(sa[i]+" ");
			}
			

		}
				

	}

}
