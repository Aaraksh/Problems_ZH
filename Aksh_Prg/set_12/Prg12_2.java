package set_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prg12_2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<>();
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an arraylist: ");
		n=sc.nextInt();
		j=n-1;
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a1.add(sc.nextInt());
		}
		Collections.sort(a1);
		for(i=0;i<n/2;i++)
		{
			if(i!=j)
			{
				System.out.print(a1.get(j)+" ");
				j--;
			}
			System.out.print(a1.get(i)+" ");
			
		}
		if((n%2)!=0)
			System.out.print(a1.get(i)+" ");
		
		sc.close();
	}

}
