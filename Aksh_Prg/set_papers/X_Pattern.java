package set_papers;

import java.util.Scanner;

public class X_Pattern 
{

	public static void main(String[] args) 
	{
		int n,l,r,len,i,j=0,temp;
		String str,reg="[a-zA-Z]*";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.next();
		if(str.matches(reg))
		{
			len=str.length();
			if(len%2!=0)
			{
				l=0;
				r=len-1;
				int mid=len/2;
				for(i=0;i<len && j<len-1;i++)
				{
					if(i==l)
					{
						System.out.print(str.charAt(i));
						
					}
					else if(i==r)
					{
						System.out.print(str.charAt(i));
						r--;
						l++;
						j++;i=-1;
						System.out.println();
						//System.out.println(j+" "+l+" "+r);
					}
					else
						System.out.print(" ");
					
					
					if(j==mid)
					{
						
					}
					
					
					
				/*	for(j=0;j<len-1;j++)
					{
						if(i==j || j==r)
							System.out.print(str.charAt(j));
						else
							System.out.print(" ");
					}   */
					
				}
			}
		}
		

	}

}
