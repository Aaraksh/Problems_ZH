package set_14;

import java.util.Scanner;

public class Prg14_2 
{
	public static int findval(char a)
	{
		if(a=='I')
			return 1;
		if(a=='V')
			return 5;
		if(a=='X')
			return 10;
		if(a=='L')
			return 50;
		if(a=='C')
			return 100;
		if(a=='D')
			return 500;
		if(a=='M')
			return 1000;
		
		
		return -1;
	}

	public static void main(String[] args) 
	{
		String str,reg="^[IVXLCDM]+$";
		char[] ch;
		int res=0,i,n,k1,k2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in roman numerals: ");
		str=sc.next();
		n=str.length();
		ch=new char[n];
		if(str.matches(reg))
		{
			ch=str.toCharArray();
			for(i=0;i<n;i++)
			{
				k1=findval(ch[i]);
				if((i+1) < n)
				{
					k2=findval(ch[i+1]);
					if(k1<k2)
					{
						k2=k2-k1;
						res+=k2;
						i++;
					}
					else
					{
						//k2=k1+k2;
						res+=k1;
						//i++;
					}
				}
				else
					res=res+k1;
			}
			System.out.println("Value of a given roman numeral: "+res);
		}

	}

}
