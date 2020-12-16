package set_37;

import java.util.Scanner;

public class Prg37_4
{
	public static int check(int[] a,int n,int key)
	{
		int i,j,count=0;
		boolean[] ch=new boolean[n];
		for(i=0;i<n;i++)
			ch[i]=true;
		
		for(i=0;i<n && ch[i]==true;i++)
		{
			for(j=0;j<n && !(a[i]>=key);j++)
			{
				if(i!=j && (a[i]+a[j]==key))
				{
					count++;
					ch[i]=false;
					ch[j]=false;
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) 
	{
		int i,n,key;
		int[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum to find: ");
		key=sc.nextInt();
		int ans=check(a,n,key);
		System.out.println(ans);
		sc.close();

	}

}
