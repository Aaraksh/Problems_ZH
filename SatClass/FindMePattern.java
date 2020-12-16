package SatClass;

import java.util.Scanner;

public class FindMePattern
{

	public static void main(String[] args)
	{
		int odd=1,even=2,i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
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
		sc.close();
	}

}
