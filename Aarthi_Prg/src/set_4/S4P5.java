package set_4;

import java.util.Scanner;

public class S4P5 
{

	public static void main(String[] args) 
	{
		int pc,n,i,re=0,flag=0;
		int dis[];
		int cap[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial petrol in car: ");
		pc=sc.nextInt();
		System.out.println("Enter the number of petrol bunks: ");
		n=sc.nextInt();
		dis=new int[n];
		cap=new int[n];
		System.out.println("Enter the distance between each bunks: ");
		for(i=0;i<n;i++)
		{
			dis[i]=sc.nextInt();
		}
		System.out.println("Enter the capacities of each bunk: ");
		for(i=0;i<n;i++)
		{
			cap[i]=sc.nextInt();
		}
		re=pc;
		for(i=0;i<n;i++)
		{
			if(re<dis[i])
			{
				System.out.println("Out of petrol..Cannot travel!!");
				flag=1;
				break;
			}
			re=re+cap[i]-dis[i];	
		}
		if(flag==0)
		{
			System.out.println("Remaining Petrol: "+re);
		}
		sc.close();

	}

}
