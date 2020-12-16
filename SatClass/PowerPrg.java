package SatClass;

import java.util.Scanner;

public class PowerPrg 
{

	public static void main(String[] args) 
	{
	
		int n,pow,i,j,p1 = 0;
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of stages: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the initial power: ");
		pow=sc.nextInt();
		System.out.println("Enter the power of each stage: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		j=1;
		
		for(i=0;i<n;i++)
		{
			pow=(pow-a[i]);
			if(pow!=0)
			{
				pow=pow+(10*j);
			}
			else
				break;
			System.out.println("==p1=="+pow);
		/*	if(p1==0)
			{
				break;
			}
			else
			{
				p1=p1+(10*j);
				j++;
			}  */
				
		}  
		if(pow==0 && i!=n)
		{
			System.out.println("Loss");
		}
		else
			System.out.println("Win");
		
	/*	for(i=0;i<n;i++)
		{
			if(pow!=0)
			{
				pow=(pow-a[i])+(10*j);
				System.out.println("pow== "+pow);
				j++;
			}
			else
				break;
		}
		if(pow<0 && i!=n)
			System.out.println("Loss");
		else
			System.out.println("Win");    */
		sc.close();
	}

}
