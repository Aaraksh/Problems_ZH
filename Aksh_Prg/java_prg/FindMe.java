package java_prg;

import java.util.Scanner;

public class FindMe
{

	public static void main(String[] args) 
	{
		int odd=1,even=2,i,j,n;
		String s,reg="[0-9]*";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        s=sc.next();
        if(s.matches(reg))
        {
        	n=Integer.parseInt(s);
        	// n=sc.nextInt();
             if(n>=3 && n<=20)
             {
                for(i=1;i<=n;i++)
                {
                 for(j=1;j<=i;j++)
                 {
                     if(i%2==0)
                     {
                         System.out.print(even+" ");
                         even+=2;
                     }
                     else
                     {
                         System.out.print(odd+" ");
                         odd+=2;
                     }
                 }
                 System.out.println();
              }
            }
             else
             {
                 System.out.println("Error");
             }

        }
        else
        	System.out.println("Error");
        
                      sc.close();


	}

}
