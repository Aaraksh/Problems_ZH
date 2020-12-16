package zh;

import java.util.Scanner;

public class SquareEqual
{

	public static void main(String[] args) 
	{
	
		int i=0,j=0,n,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		n=sc.nextInt();
		for(i=1;i*i<=n;i++)
		{
			for(j=i;j*j<=n;j++)
			{
				if((i*i)+(j*j)==n)
				{
					c++;
				}
			}
		}
		if(c==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
		sc.close();
	}

}
