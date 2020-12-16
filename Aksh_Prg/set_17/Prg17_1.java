package set_17;

import java.util.Scanner;

public class Prg17_1
{
	public static void pattern(String ss,int n)
	{
		int i,j,k=0,s=0,f;
		f=(n-1)*2;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=f;j++)
			{
				if(j!=f)
					System.out.print(" ");
				else
				{
					for(k=0;k<=s;k++)
					{
						System.out.print(ss.charAt(k));
					}
				}
			}
			s++;
			f=f-2;
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		String str,s1,s2,reg="[a-zA-Z]*";
		int len,mid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.next();
		len=str.length();
		if(len%2 !=0 && str.matches(reg))
		{
			mid=len/2;
			s1=str.substring(0, mid);
			s2=str.substring(mid, len);
			str=s2+s1;
			pattern(str,len);
		}
		else
		{
			System.out.println("Given string is not in odd length or it contains any special characters!!");
		}
		sc.close();

	}

}
