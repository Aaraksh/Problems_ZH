package set_3;

import java.util.Scanner;

public class S3P6
{
	public static String strreverse(String s)
	{
		if(s.isEmpty())
			return s;
		else
			return(strreverse(s.substring(1))+s.charAt(0));
	}
	
	public static void main(String[] args) 
	{
		String str,res="",s="";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		/*String[] ss=str.split(" ");
		for(i=len-1;i>=0;i--)   //Using inbuilt method
		{
			if(i==len-1)
				res=ss[i];
			else
				res=res+" "+ss[i];
			
		}
		System.out.println(res);*/
		
		for(i=str.length()-1;i>=0;i--)
		{
			while(i>=0 && str.charAt(i)!=' ')
			{
				s=s+str.charAt(i);
				i--;
			}
			
			res=strreverse(s);
			s="";
			System.out.print(res+" ");
		}
		sc.close();
	}

}
