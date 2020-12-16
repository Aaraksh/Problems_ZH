package zh;

import java.util.Arrays;
import java.util.Scanner;

public class MissingAp
{
	int mid=0;
	public int find(int b[],int low,int high,int diff)
	{
	
		if(high<=low)
		{
			return low;
		}
		
		mid=low+(high-low)/2;
		
		if(b[mid+1]-b[mid]!=diff)
		{	
			return (b[mid]+diff);
		}
		
		if(b[mid]-b[mid-1]!=diff)
		{
			return (b[mid-1]+diff);
		}
		
		if(b[mid]==b[0]+mid*diff)
		{
			return find(b,mid+1,high,diff);
		}
		
		return find(b,low,mid-1,diff);
		
		
		
	}
	

	public static void main(String[] args) 
	{
	
		int mid,i,j,m,n,c=0,size=0,diff=0,temp=0;
		int[][] a;
		int[] b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the 2 dimensional array  n*m: ");
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n][m];
		b=new int[n*m];
		System.out.println("Enter the values of array elements: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				b[c]=a[i][j];
				c++;
			}
			System.out.println();
		}
		Arrays.sort(b);
		size=c;
		temp=n*m;
		System.out.print("Sorted array values are: ");
		
		for(i=0;i<size;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
	    System.out.println("b[n-1]= "+b[temp-1]+"  b[0]= "+b[0]+"  size= "+size +"  temp= "+temp);
		diff=(b[temp-1] - b[0])/size;  //temp=size of the b array
		System.out.println("Diff: "+diff);
		MissingAp ma=new MissingAp();
		int res=ma.find(b,0,temp-1,diff);
		
		System.out.println("Missing element is: "+res);
		sc.close();

	}

}
