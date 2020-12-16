package java_prg;
import java.util.Scanner;
public class XPattern 
{
	public static void main(String[] args) 
	{
		int l,n,i,j,k;
        char[] a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.next();
        l=s.length();
        n=l;
        a=new char[l];
        
        k=l-1;
        if(l>=3 && l<=15)
        {
            if(l%2==0)
           {
               s="#"+s;
              // System.out.println(s);
               l++;
               k=l-1;
           }
           
            //else
            {
                 a=s.toCharArray(); 
               for(i=0;i<l/2;i++)
               {
                   for(j=0;j<l;j++)
                   {
                       if(i==j || j==k)
                       {
                           System.out.print(a[j]);
                       }
                       else
                       {
                           System.out.print(" ");
                       }
                   }
                   k--;
                   System.out.println();
               }
                k=l/2;
                for(i=l/2;i>=0;i--)
                {
                    for(j=0;j<l;j++)
                    {
                        if(j==i || j==k)
                        {
                            System.out.print(a[j]);
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    k++;
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("Error on Length");
        }
        	}

}
