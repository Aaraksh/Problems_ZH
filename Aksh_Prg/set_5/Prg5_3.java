package set_5;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prg5_3 
{

	public static void main(String[] args) 
	{
		int i,n1,n2;
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		//ArrayList<Integer> union=new ArrayList<>();
		ArrayList<Integer> inter=new ArrayList<>();
		ArrayList<Integer> except=new ArrayList<>();
		Set<Integer> union=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array-1: ");
		n1=sc.nextInt();
		for(i=0;i<n1;i++)
		{
			l1.add(sc.nextInt());
		}
		System.out.println("Enter the size of an array-2: ");
		n2=sc.nextInt();
		for(i=0;i<n2;i++)
		{
			l2.add(sc.nextInt());
		}
		
		for(Integer aa:l1)
		{
			if(!(aa%2==0))
				except.add(aa);
		}
		for(Integer aa:l2)
		{
			if(aa%2==0)
				except.add(aa);
		}
		
		union.addAll(l1);
		union.addAll(l2);
		System.out.println("Union: "+union);
		
		inter=l1;
		inter.retainAll(l2);
		System.out.println("Intersection: "+inter);
		
		System.out.println("Except: "+except);
		sc.close();

	}

}
