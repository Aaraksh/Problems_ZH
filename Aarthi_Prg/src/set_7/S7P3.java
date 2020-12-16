package set_7;

import java.util.Scanner;
import java.util.Stack;

public class S7P3 
{ 
	public static void evaluate(String ss)
	{
		Stack<Integer> val=new Stack<Integer>();
		Stack<Character> op=new Stack<Character>();
		char[] tt=ss.toCharArray();
		String s="";
		int i;
		
		for(i=0;i<tt.length;i++)
		{
			//System.out.println("In"+tt[i]);
			if(tt[i]==' ')
				continue;
			if(tt[i]>='0' && tt[i]<='9')
			{
				while(i<tt.length && (tt[i]>='0' && tt[i]<='9'))
				{
					s=s+tt[i++];
				}
				val.push(Integer.parseInt(s));
				s="";
				i--;
			}
			else if(tt[i]=='(')
			{
				op.push(tt[i]);
			}
			else if(tt[i]==')')
			{
				while(!op.empty() && op.peek()!='(')
					val.push(calculate(op.pop(),val.pop(),val.pop()));
				op.pop();
			}
			else if(tt[i]=='+' || tt[i]=='-' || tt[i]=='*' || tt[i]=='/')
			{
				while(!op.empty() && precedence(op.peek(),tt[i]))
					val.push(calculate(op.pop(),val.pop(),val.pop()));	
				
				op.push(tt[i]);
			}
			
		}
		while(!op.empty())
			val.push(calculate(op.pop(),val.pop(),val.pop()));
		
		System.out.println("Value: "+val.pop());
	}
	public static boolean precedence(char o1,char o2)
	{
		if(o1=='(' || o1==')')
			return false;
		if((o1=='+' || o1=='-') && (o2=='*' || o2=='/'))
			return false;
		else if(o1=='*' || o1=='/')
			return true;
		else
			return true;
	}
	public static int calculate(char op,int b,int a)
	{
		if(op=='+')
		{
			return a+b;
		}
		else if(op=='-')
		{
			return a-b;
		}
		else if(op=='*')
		{
			return a*b;
		}
		else if(op=='/')
		{
			if(b==0)
				throw new UnsupportedOperationException("Cannot divide by Zero!!");
			return a/b;
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		String str,reg="[0-9()//*+-]+";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expression to evaluate: ");
		str=sc.next();
		if(str.matches(reg))
		{
			//System.out.println("IN");
			evaluate(str);
		}
		else
		{
			System.out.println("Enter the valid expression!!");
		}
		sc.close();
	}

}
