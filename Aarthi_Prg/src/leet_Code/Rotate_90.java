package leet_Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate_90 
{

	public static void main(String[] args) 
	{
		int n,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		int[][] a=new int[n][n];
		System.out.println("Enter the elements of a 2*2 array: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=(n/2);i++)
		{
			for(j=i;j<n-1-i;j++)
			{
				temp=a[i][j];
                a[i][j]=a[n-1-j][i];
                a[n-1-j][i]=a[n-1-i][n-1-j];
                a[n-1-i][n-1-j]=a[j][n-1-i];
                a[j][n-1-i]=temp;
			}
		} 
		
		List<List<Integer>> res=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			List<Integer> li=new ArrayList<Integer>();
			for(j=0;j<n;j++)
			{
				li.add(a[i][j]);
			}
			res.add(li);
		}
		System.out.println(res);
		sc.close();

	}

}
