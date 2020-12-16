package leet_Code;

import java.util.Scanner;

public class AtoiCon 
{
	public static int convert(String s)
	{
		
		int i=0,res=0,sig=1,len;
		len=s.length();
		if(s.length()==0)
			return 0;
		while(i<len && s.charAt(i)==' ')
			i++;
		if(i<len && (s.charAt(i)=='+' || s.charAt(i)=='-'))
			sig=(s.charAt(i++)=='+')?1:-1;
		
		while(i<len && s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			//System.out.println(s.charAt(i));
			if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10  && s.charAt(i)-'0'> Integer.MAX_VALUE%10) )
			{
				return (sig==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			res=res*10+(s.charAt(i)-'0');
			i++;
		}
		return res*sig;
			
	}

	public static void main(String[] args) 
	{
		String s;
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to convert to integer: ");
		s=sc.nextLine();
		res=convert(s);
		System.out.println(res);
		sc.close();

	}

}
