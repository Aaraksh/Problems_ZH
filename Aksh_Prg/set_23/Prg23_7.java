package set_23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prg23_7 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		Set<Integer> union=new HashSet<>();
		int n1,n2,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		n1=sc.nextInt();
		System.out.println("Enter the elements of first array: ");
		for(i=0;i<n1;i++)
		{
			a1.add(sc.nextInt());
		}
		System.out.println("Enter the size of second array: ");
		n2=sc.nextInt();
		System.out.println("Enter the elements of second array: ");
		for(i=0;i<n2;i++)
		{
			a2.add(sc.nextInt());
		}
		union.addAll(a1);
		union.addAll(a2);
		System.out.println("Union of two array elements: "+union);
		sc.close();
	}

}
