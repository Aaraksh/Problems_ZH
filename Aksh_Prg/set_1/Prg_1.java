package set_1;

import java.util.Scanner;

public class Prg_1
{
	
	public static void main(String[] args) 
	{
		String s,reg="^[a-zA-Z]+";
		int len,k,i,j = 0,mid=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		if(s.matches(reg))
		{
			len=s.length();
			k=len-1;
			mid=k/2-1;
			for(i=0;i<len;i++)
			{
				if(i<=len/2)
				{
					for(j=0;j<len;j++)
					{
						if(i==j)
						{
							System.out.print(s.charAt(j));
						}
						else if(j==k)
						{
							System.out.print(s.charAt(j));
							k--;
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				else
				{
					for(j=0;j<len;j++)
					{
						if(j==mid)
						{
							System.out.print(s.charAt(j));
							mid--;
							
						}
						else if(j==k+1)
						{
							System.out.print(s.charAt(j));
							k++;
							break;
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			
		}
		sc.close();
	}

}
