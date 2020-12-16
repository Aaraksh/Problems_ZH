package set_3;

import java.util.Scanner;

public class Prg3_6 
{

	public static String reversestring(String st) 
	{
		if(st.isEmpty())
			return st;
		else
			return(reversestring(st.substring(1))+st.charAt(0));
	}
	public static void main(String[] args) 
	{
		String str,res;
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse: ");
		str=sc.nextLine();
		String[] s=str.split(" ");
		
				
		for(i=s.length-1;i>=0;i--)
		{		
			StringBuilder st=new StringBuilder(s[i]);
			
			String st1=st.reverse().toString();
			//System.out.println(st1);
			res=reversestring(st1);
			System.out.print(res+" ");
		}
		sc.close();
		
	}


}
