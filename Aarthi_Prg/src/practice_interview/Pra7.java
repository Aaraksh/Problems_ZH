package practice_interview;

import java.util.Scanner;

public class Pra7 
{

	public static void main(String[] args) 
	{
		int n1,n2,i,j=0,ca=0,l1,l2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1: ");
		n1=sc.nextInt();
		int[] a1=new int[n1];
		System.out.println("Enter the elements of an array1: ");
		for(i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array 2: ");
		n2=sc.nextInt();
		int[] a2=new int[n2];
		System.out.println("Enter the elements of an array2: ");
		for(i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		l1=n1-1;l2=n2-1;
		int[] res=new int[n1+n2];
		int len=(n1<n2)?n1:n2;
		for(i=0;i<len;i++)
		{
			res[j++]=(a1[l1]+a2[l2]+ca)%10;
			ca=(a1[l1]+a2[l2]+ca)/10;
			l1--;
			l2--;	
		}
		if(n1>n2)
		{
			for(i=(n1-n2-1);i>=0;i--)
			{
				res[j++]=(a1[i]+ca)%10;
				ca=(a1[i]+ca)/10;
			}
			if(ca!=0)
				res[j++]=ca;
		}
		else if(n2>n1)
		{
			for(i=(n2-n1-1);i>=0;i--)
			{
				res[j++]=(a2[i]+ca)%10;
				ca=(a2[i]+ca)/10;
			}
			if(ca!=0)
				res[j++]=ca;
		}
		else if(n1==n2)
		{
			if(ca!=0)
				res[j++]=ca;
		}
		
		for(i=j-1;i>=0;i--)
		{
			System.out.print(res[i]+" ");
		}
		sc.close();
	}

}
