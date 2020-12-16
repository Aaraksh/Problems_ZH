package practice_zh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtraElement 
{

	public static void main(String[] args) 
	{
		Integer[] a;
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new Integer[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArrayList<Integer> aa=new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> arr=new ArrayList<>();
		for(int ele:aa)
		{
			if(!(arr.contains(ele)))
				arr.add(ele);
			
		}
		System.out.println(arr);
		sc.close();	
	}

}
