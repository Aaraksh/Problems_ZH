package set_papers_prg;

import java.util.Scanner;

public class StrikeOut
{

	public static void main(String[] args)
	{
		int i,st=1,k,n,count=0,val=0,flag=0;
		String s,s1,reg="[0-9]*";
		int[] a;
		boolean[] visit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		s=sc.next();
		System.out.println("Enter the strike count: ");
		s1=sc.next();
		if(s.matches(reg) && s1.matches(reg))
		{
			n=Integer.parseInt(s);
			count=n;
			k=Integer.parseInt(s1);
			a=new int[n];
			visit=new boolean[n];
			
			System.out.println("Enter the array elements: ");
			for(i=0;i<n;i++)
			{
				
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				visit[i]=false;
			}
			while(count>1)
			{
				
				while(st<k)
				{
					if(visit[val]==false)
					{
						st++;
						val=(++val%n);
						while(visit[val]==true)
						{
							val=(++val%n);
							flag++;
						}
						if(flag>1)
						{
							//st--;
							flag=0;
						}
					}
					else
					{
						val=(++val%n);
					}
				}
				System.out.println(a[val]+" "+visit[val]);
				visit[val]=true;				
				st=1;
				val=(val++%n);
				count--;
			}
			System.out.println("Exit");
			for(i=0;i<n;i++)
			{
				if(visit[i]==false)
					System.out.println("output"+a[i]);			
			}
		}
		sc.close();	
	}

}
