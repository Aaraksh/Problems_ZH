package practice_interview;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Pra3 
{

	public static void main(String[] args) 
	{
		int n1,n2,i;
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array1: ");
		n1=sc.nextInt();
		
		System.out.println("Enter the elements of array1: ");
		for(i=0;i<n1;i++)
		{
			ar1.add(sc.nextInt());
		}
		
		System.out.println("Enter the size of array2: ");
		n2=sc.nextInt();
		
		System.out.println("Enter the elements of array2: ");
		for(i=0;i<n2;i++)
		{
			ar2.add(sc.nextInt());
		}
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		TreeSet<Integer> tt=new TreeSet<>(ar1);
		System.out.println("Merged Array: "+tt);
		sc.close();

	}

}
