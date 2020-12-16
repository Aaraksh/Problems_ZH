package leet_Code;

import java.util.Scanner;

public class ValidString 
{
	 public static boolean isValid(String s) 
	    {
	        char[] a=s.toCharArray();
	        int i,j=0,n,flag=0;
	        n=s.length();
	        char[] c=new char[n];
	        for(i=0;i<n;i++)
	        {
	            if((i==0) && (a[i]==']' || a[i]==')' || a[i]=='}') )
	            {
	                flag=1;
	                break;
	            }
	            else if(a[i]=='[' || a[i]=='(' || a[i]=='{')
	            {
	                c[j]=a[i];
	                j++;
	            }
	            else if(a[i]==']' || a[i]==')' || a[i]=='}' && j>0)
	            {
	            	 if((c[j-1]=='(' && a[i]==')') || (c[j-1]=='{' && a[i]=='}') || (c[j-1]=='[' && a[i]==']'))
	                {
	            		 System.out.println(c[j-1]+" "+a[i]);
	                    j--;
	                } 
	                else
	                {
	                	System.out.println(a[i]+" "+a[i-1]);
	                    flag=1;
	                    break;
	                }
	            }
	            else
	            	flag=1;
	        }
	        System.out.println(j);
	        if(flag==1 || j>0)
	            return false;
	        else
	            return true;
	    }
	public static void main(String[] args) 
	{
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		s=sc.next();
		System.out.println(isValid(s));
		sc.close();
	}

}
