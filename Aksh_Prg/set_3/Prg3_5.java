package set_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prg3_5
{

	public static void main(String[] args)
	{
		int i,l1,l2;
		
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		l1=sc.nextInt();
		System.out.println("Enter the elements of the first array: ");
		for(i=0;i<l1;i++)
		{
			a1.add(sc.nextInt());
		}
		System.out.println("Enter the size of second array: ");
		l2=sc.nextInt();
		System.out.println("Enter the elements of the second array: ");
		for(i=0;i<l2;i++)
		{
			a2.add(sc.nextInt());
		}
		a2.removeAll(a1);
		a1.addAll(a2);
		Collections.sort(a1);
		System.out.println(a1);
		sc.close();

	}

}
