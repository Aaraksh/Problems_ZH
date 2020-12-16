package set_papers_prg;

import java.util.Scanner;

public class MagicalDrum 
{

	public static void main(String[] args) 
	{
		int n,i,j,l=0,r,area=0;
		String s,reg="[0-9]*";
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		s=sc.next();
		if(s.matches(reg))
		{
			n=Integer.parseInt(s);
			if(n>0)
			{
				a=new int[n];
				System.out.println("Enter the array elements: ");
				for(i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				r=n-1;
				while(l<r)
				{
					area=Math.max(area, (a[l]<a[r]?a[l]:a[r])*(r-l));
					if(a[l]<a[r])
						l++;
					else
						r--;
				}
				System.out.println("Area: "+area);
			}
		}
		else
		{
			System.out.println("Error");
		}
		
		
		
		

	}

}
