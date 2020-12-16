package zh;

import java.util.Scanner;


public class Blogger 
{

	public static void main(String[] args)
	{
		String s1;
        char[] a;
        
        int i,n,u=0,v=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        s1=sc.nextLine();
       // s1=s1.replace("_", "<b>");
        System.out.println("string: "+s1);
        n=s1.length();
        a=new char[n];
        a=s1.toCharArray();
     for(i=0;i<n;i++)
        {
        	System.out.println("a[i]: "+a[i]);
            if(a[i]=='_')
            {
                u++;
            }
            else if(a[i]=='*')
            {
                v++;
            }
        }
     
     String[] sa=new String[n];
     for(i=0;i<n;i++)
     {
    	 sa[i]=Character.toString(a[i]);
    	 //System.out.println("Sample: "+sa[i]);
     }
     s1=String.valueOf(a);
     
        System.out.println("u: "+u);
        System.out.println("v: "+v); 
        //String re="<b>";
        //String re1="</b>";
        
       if(u%2==0  && v%2==0)
        {
            for(i=0;i<n;i++)
            {
               
                    if(v%2==0 && a[i]=='*')
                    {
                        sa[i]="<b>";
                        v--;
                    }
                    else if(v%2!=0 && a[i]=='*')
                    {
                        sa[i]="</b>";
                        v--;
                    }

            }
            for(i=0;i<n;i++)
            {
               
                    if(u%2==0 && a[i]=='_')
                    {
                        sa[i]="<i>";
                        u--;
                    }
                    else if(u%2!=0 && a[i]=='_')
                    {
                        sa[i]="</i>";
                        u--;
                    }

            }

            for(i=0;i<n;i++)
            {
         	   System.out.print(sa[i]);
            }
        }
       else
       {
    	   System.out.println("Error");
       }
       
       sc.close();
      
           }

	}


