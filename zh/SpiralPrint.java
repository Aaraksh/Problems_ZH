package zh;

import java.util.Scanner;

public class SpiralPrint 
{

	public static void main(String[] args) 
	{
		    int i,j,k=0,m,n,s=0,l=0,r,c,x=0;
	        String[][] a; 
	        String[] ch;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the value of n: ");
	        n=sc.nextInt();
	        m=n;
	        r=m;
	        c=n;
	        a=new String[n][n];
	        
	        System.out.println("Enter the array elements: ");
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                a[i][j]=sc.next();
	            }
	        }  
	       // String ss=sc.nextLine();
	      //  ch=ss.split("");
	      /*  for(i=0;i<n;i++)
	        {
	        	for(j=0;j<n;j++)
	        	{
	        		a[i][j]=Integer.parseInt(ch[x]);
	        		x++;
	        	}
	        }  */
	        while(k<m && s<n)
	        {
	           // System.out.println("Entered loop");
	            for(i=s;i<n;i++)
	            {
	                System.out.print(a[k][i]+" ");
	                
	            }
	            k++;
	           for(i=k;i<m;i++)
	            {
	                System.out.print(a[i][n-1]+" ");
	            }
	            n--;
	            for(i=n-1;i>=s;i--)
	            {
	                System.out.print(a[m-1][i]+" ");
	            }
	            m--;
	           for(i=m-1;i>=k;i--)
	            {
	                System.out.print(a[i][s]+" ");
	            }
	            s++;  
	        }
	        sc.close();
	}

}
