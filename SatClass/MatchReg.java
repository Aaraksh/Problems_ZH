package SatClass;

import java.util.Scanner;

public class MatchReg 
{

	public static void main(String[] args) 
	{
	
		    String reg,reg1,str;
		    char[] a;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the regular expression: ");
	        reg=sc.next();
	        reg1=reg;
	        System.out.println("Enter the String: ");
	        str=sc.next();
	        a=reg.toCharArray();
	        
	        if(a[0]=='+' || a[0]=='*')	
	        {
	        	System.out.println("Null");
	        }
	        else if(str.matches(reg1))
	        {
	            System.out.println("True");
	        }
	        else
	        {
	            System.out.println("False");
	        }
	        sc.close();
	}

}
