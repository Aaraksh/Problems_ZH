package leet_Code;

import java.util.Scanner;
import java.util.Stack;
// continuous valid long param=> ())()() ->4
public class ValidParan
{
	public static int countparan(String s)
	{
		int max=0,i,l;
		Stack<Integer> st=new Stack<>();
		st.push(-1);
		l=s.length();
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)=='(')
				st.push(i);
			else
			{
				st.pop();
				if(st.empty())
				{
					st.push(i);
				}
				else
				{
					max=Math.max(max, i-st.peek());
				}
			}
			
		}
		
		
		return max;
	}

	public static void main(String[] args) 
	{
		String s,reg="[//(//)]*";
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String contains paranthesis: ");
		s=sc.next();
		if(s.matches(reg))
		{
			c=countparan(s);
		}
		else
		{
			c=0;
		}
		System.out.println(c);
		sc.close();

	}

}
