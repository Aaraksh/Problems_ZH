package set_8;

import java.util.Scanner;

public class Prg8_3 
{

	public static void substring(String str,int n)
	{
		int flag=0,i,j,k;
		for(i=1;i<=n;i++)
		{
			 for(j=0;j<=n-i;j++)
			 {
				 flag=j+i-1;
				 for(k=j;k<=flag;k++)
				 {
					System.out.print(str.charAt(k)); 
				 }
				 System.out.println();
			 }
		}
	}
	public static void main(String[] args) 
	{
		int n;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.next();
		n=str.length();
		substring(str,n);
		sc.close();
	}

}
