package set_34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Prg34_5 
{

	public static void main(String[] args) 
	{
		int i,j,n,c=0,flag=0;
		int[] a;
		HashMap<Integer, Integer> hh=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			for(j=i;j<n && i<n;j++)
			{
				if(a[i]==a[j])
				{
					if(j==n-1)
					{
						flag=1;
					}
					c++;
				}
				else
				{			
					i=j-1;
					break;
				}
			}
			//System.out.println(i+" "+j);
			System.out.println(c);
			hh.put(c, a[i]);
			c=0;
			if(flag==1)
				break;			
		}
		System.out.println(hh);
		//NavigableSet<Integer> map=new TreeMap<Integer, Integer>(hh).descendingKeySet();
		System.out.println(hh);
		sc.close();	

	}

}
