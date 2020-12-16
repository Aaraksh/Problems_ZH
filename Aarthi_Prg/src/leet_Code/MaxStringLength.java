package leet_Code;

import java.util.Scanner;

public class MaxStringLength 
{
	public static int findmax(String s)
	{
		int i,j,max=0,c=1,len;
		len=s.length();
		if(s!=null)
		{
			for(i=0;i<len;i++)
			{
				for(j=i+1;j<len;j++)
				{
					if(!(s.substring(i, j).contains(s.substring(j, j+1))))
					{
						c++;
					}
					else
					{
						break;
					}
				}
				if(c>max)
				{
					max=c;
				}
				c=1;
			}
			return max;
		}
		else
			return 0;
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		str=sc.next();
		int max=findmax(str);
		System.out.println(max);
		sc.close();

	}

}
