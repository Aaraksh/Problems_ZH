package set_23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prg23_8
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		int n,i;
		Set<Integer> res=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		res.addAll(a);
		System.out.println("Array elements without duplicates: "+res);
		sc.close();

	}

}
