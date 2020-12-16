package set_papers_prg;

import java.util.Scanner;

public class WormHole 
{

	public static void main(String[] args) 
	{
		int n,i,j,fin=0,lin=0,co=0,max=0;
		int[] a;
		String ss,reg="[0-9]*";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		ss=sc.next();
		
		if(ss.matches(reg))
		{
			n=Integer.parseInt(ss);
			a=new int[n];
			System.out.println("Enter the array elements: ");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				for(j=n-1;j>i;j--)
				{
					if(a[i]==a[j])
					{
						co=j-i;
						if(co>max)
						{
							max=co;
							fin=i;
							lin=j;
						}
					}
				}
			}
			for(i=0;i<n;i++)
			{
				if(i==fin)
					i=lin;
				System.out.print(a[i]+" ");
			}
		}
		sc.close();

	}

}
