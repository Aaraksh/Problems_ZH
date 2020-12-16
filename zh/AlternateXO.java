package zh;

import java.util.Scanner;


public class AlternateXO 
{

	public static void main(String[] args) 
	{
		int i,j,k=0,s=0,m,n,r,c;
		char cc='X';
		char[][] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values of m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		a=new char[m][n];
		r=m;
		c=n;
		while(k<m && s<n)
		{
			for(i=s;i<n;++i)
			{
				a[k][i]=cc;
				
			}
			k++; 
			
			for(i=k;i<m;++i)
			{
				a[i][n-1]=cc;
			}
		
			n--;
			
		//	if(k<m)
			{
				for(i=n-1;i>=s;--i)
				{
					a[m-1][i]=cc;
				}
			    m--;
			}
			
			//if(s<n)
			{
				for(i=m-1;i>=k;--i)
				{
					a[i][s]=cc;
				}
				s++;
			}
			
			
			//count++;
			
			cc = (cc == '0')? 'X': '0'; 
			
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
