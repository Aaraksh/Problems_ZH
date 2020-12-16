package leet_Code;

import java.util.Scanner;

public class ZigZagCon 
{
	public static String convert(String s,int r)
	{
		int len,i,j,n=0,n1,n2,c=0;
		String ans="";
		len=s.length();
		n=(2*r)-2;
		//System.out.println(n);
		
		n1=n;
		n2=0;
		if(len==1 || r==1)
		{
			ans=s;
		}
		else
		{
			for(i=0;i<r;i++)
			{
				
				c=0;
				for(j=i;j<len;j++)
				{
					System.out.println(j);
					if(i==0 || i==(r-1))
					{
						ans=ans+s.charAt(j);
						j+=n-1;
					}
					else
					{
						if(c%2==0)
						{
							ans=ans+s.charAt(j);
							j+=n1-1;
						}
						else
						{
							ans=ans+s.charAt(j);
							j+=n2-1;
						}
						c++;
					}
				}
				n1-=2;
				n2+=2;
			}
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int key;
		String str,res="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.next();
		
		System.out.println("Enter the num of rows(ZIGZAG): ");
		key=sc.nextInt();
		res=convert(str,key); 
		System.out.println(res);
		sc.close();
	}

}
