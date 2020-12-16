package java_prg;

import java.util.Scanner;

public class Stephen 
{

	public static void main(String[] args) 
	{
		 String s1,s2="";
	        char[] a;
	        int i,len,n,aa;
	        Scanner sc=new Scanner(System.in);
	       // System.out.println("Enter the String: ");
	        s1=sc.nextLine();
	       // System.out.println("Enter the characters to move: ");
	        n=sc.nextInt();
	        len=s1.length();
	        a=s1.toCharArray();
	        if(n>=0 && n<=9)
	        {
	            for(i=0;i<len;i++)
	        {
	            if(a[i]>=65 && a[i]<=90)
	            {
	                aa = a[i]+n;
	                if(aa<=90)
	                {
	                    s2=s2+(char)aa;
	                }
	                else
	                {
	                    aa=aa-26;
	                    s2=s2+(char)aa;             
	                }
	            }
	            
	            else if(a[i]>=97 && a[i]<=122)
	            {
	                aa=a[i]+n;
	                if(aa<=122)
	                {
	                    s2=s2+(char)aa;
	                }
	                else
	                {
	                    aa=aa-26;
	                    s2=s2+(char)aa;
	                }
	            }
	            else if(a[i]>=48 && a[i]<=57)
	            {
	                aa=a[i]+n;
	                if(aa<=57)
	                {
	                    s2=s2+(char)aa;
	                }
	                else
	                {
	                    aa=aa-9;
	                    s2=s2+(char)aa;
	                }
	            }
	            else
	            {
	                s2=s2+a[i];
	            }
	        }
	        System.out.println(s2);
	       

	        }
	     /*   else
	        {
	            System.out.println("Error");
	        }   */
	                sc.close();



	}

}
