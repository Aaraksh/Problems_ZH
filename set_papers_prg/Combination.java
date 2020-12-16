package set_papers_prg;

import java.util.Scanner;

public class Combination
{

	public void findcomb(int[] a,int n,int k,int index,int s,int[] ne)
	{
		int j;
		if(index==k)
		{
			for(j=0;j<k;j++)
			{
				System.out.print(ne[j]);
			}
			System.out.println();
			return;
		}
		if(s>=n)
			return;
		
		ne[index]=a[s];
		findcomb(a, n, k, index+1, s+1, ne);
		findcomb(a, n, k, index, s+1, ne);
	}
	public static void main(String[] args) 
	{
		int n,k,index=0,i;
		int[] a; int[] ne;
		Combination cc=new Combination();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of a sub-array: ");
		k=sc.nextInt();
		ne=new int[k];
		cc.findcomb(a,n,k,index,0,ne);

	}

}
