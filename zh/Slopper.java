package zh;

import java.util.Scanner;
import java.util.regex.*;

public class Slopper 
{

	public static void main(String[] args)
	{
		 String c;
	        int i,j,k=0,l=1,n1=0,n2,n,sa=0,s=1;
	        Scanner sc=new Scanner(System.in);
	       // c=sc.next().trim().charAt(0); 
	      //  n=sc.nextInt();
	        System.out.println("Enter the value: ");
	       c=sc.nextLine();
	       // n=Integer.parseInt(c);
	      //  System.out.println("parse: "+n);
	       
	       
	        if(Pattern.matches("[0-9][0-9]",c) || Pattern.matches("[0-9]",c))
	        {
	            n=Integer.parseInt(c); 
	           // n=(int)c-48;
	          // System.out.println("value ofn: "+n);
	         n2=n;
	         n1=n;
	        if(n>=3 && n<=20)
	        {
	        for(i=1;i<=n;i++)
	        {
	            //n2=n;
	            sa=l; n2=n-i+1;
	            for(j=1;j<=i;j++)
	            {
	                
	                System.out.print(sa+" ");
	                
	                sa=sa-n2; 
	            //    System.out.print(" value of n2: "+n2);
	                n2++;
	        
	            }
	            System.out.println();
	            l=l+n1;
	            n1--;
	        }
	        }
	        else
	        {
	            System.out.println("Error");
	        }
	        }
	        else
	        {
	            System.out.println("Error");
	        }
	      
	        sc.close();
		}

	}


