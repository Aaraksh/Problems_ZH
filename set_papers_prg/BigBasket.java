package set_papers_prg;

import java.util.Scanner;

public class BigBasket
{

	public static void main(String[] args)
	{
		int n,th,flag=1,i,sum=0,r,res;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of apple: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the weight of each apple: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the threshold value: ");
		th=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]>th || a[i]<1)
			{
				flag=0;
				break;
			}
			sum=sum+a[i];
		}
		if(flag==0)
			System.out.println("Error");
		else
		{
			res=sum/th;
			r=sum%th;
			if(r>0)
				res++;
			System.out.println(res);
		}
		sc.close();
	}

}
