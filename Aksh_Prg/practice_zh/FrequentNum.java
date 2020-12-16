package practice_zh;

import java.util.Arrays;
import java.util.Scanner;

public class FrequentNum
{

	public static void main(String[] args) 
	{
		int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE,i,j,n,ans1 = 0,ans2=0,c=0;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				//System.out.println(i+" "+j);
				if(a[i]==a[j])
				{
					c++;
				}
				else
					break;			
			}
			if(max<=c)
			{
				ans1=a[i];
				max=c;
			}
			else if(smax<c)
			{
				System.out.println("In");
				ans2=a[i];
				smax=c;
			}
			c=0;
			i=j-1;
		}
		System.out.println(ans2);
		sc.close();

	}

}
