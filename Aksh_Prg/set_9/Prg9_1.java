package set_9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Prg9_1
{

	public static void main(String[] args) 
	{
		int n1,n2,i;
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1: ");
		n1=sc.nextInt();
		System.out.println("Enter the elements of List1: ");
		for(i=0;i<n1;i++)
		{
			a1.add(sc.nextInt());
		}
		System.out.println("Enter the value of n2: ");
		n2=sc.nextInt();
		System.out.println("Enter the elements of List2: ");
		for(i=0;i<n2;i++)
		{
			a2.add(sc.nextInt());
		}
		a2.removeAll(a1);
		a1.addAll(a2);
		TreeSet<Integer> tt=new TreeSet<>(a1);
		System.out.println(tt);
		sc.close();

	}

}
