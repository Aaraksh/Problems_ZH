package zh;

import java.util.Arrays;
import java.util.Scanner;

public class SortZigZag
{

	static int k;
	public static void main(String[] args)
	{
	
		int n,i,j=0,c=0,s=0;
		int[][] a= new int[50][50];
		int[] b=new int[50];
		int[] d=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix size n :");
		n=sc.nextInt();
		System.out.println("Enter the value of matrix elements: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{
			if(k==0)
			{
				if(i%2==0)
				{
					for(j=k;j<n;j++,k++)
					{
						b[c]=a[i][j];
						c++;
					}
				
					i=i+1;
					b[c]=a[i][j-1];
					//System.out.println("dummy"+b[c]);
					c++; 
				
				}
				k--;
				//System.out.println(" Value of k is:"+k);
			}
			
			else if(k==n-1)
			{
				if(i%2==0)
				{
					for(j=k;j>=0;j--,k--)
					{
						b[c]=a[i][j];
						c++;
						
					}
				
					i=i+1;
					b[c]=a[i][j+1];
					c++;
					k++;
				}
			}
		}
		
		for(i=0;i<c-1;i++)
		{
			d[i]=b[i];
			System.out.println("ZigZag elements are: "+b[i]);
		}
		//System.out.println("Value of c:"+i);
	    int max=d[0];
	    int t;
		for(i=0;i<c-1;i++)
		{
			for(j=0;j<c-1;j++)
			{
			   if(d[i]<d[j])
			   {
				 t=d[i];
				 d[i]=d[j];
				 d[j]=t;
			   }
			}
			
		}
		System.out.println("After sorting: ");
		for(i=0;i<c-1;i++)
		{
			System.out.println(d[i]);
		}
		
		
		k=0; c=0;
		for(i=0;i<n;i++)
		{
			if(k==0)
			{
				if(i%2==0)
				{
					for(j=k;j<n;j++,k++)
					{
						a[i][j]=d[c];
						c++;
					}
					i=i+1;
					a[i][j-1]=d[c];
					c++;
					s=j-2;
					k--;
					
					for(j=s;j>=0;j--)
					{
						a[i][j]=0;
					}
					//k=n-1;
					//k++;
				}
			}
			
			if(k==n-1)
			{
				if(i%2==0)
				{
				for(j=k;j>=0;j--,k--)
				{
					a[i][j]=d[c];
					c++;
				}
				i=i+1;
				a[i][j+1]=d[c];
				c++;
				s=j+2;
				for(j=s;j<n;j++)
				{
					a[i][j]=0;
				}
			//	a[i][j]=d[c];
			//	c++;
			//	k=0;
				k++;
				}
			}
			
		}
		
		System.out.println("Sorted matrix: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}


	}

}
