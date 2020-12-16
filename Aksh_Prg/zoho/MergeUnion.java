package zoho;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeUnion 
{

	public static void main(String[] args) 
	{
		ArrayList< Integer> aa=new ArrayList<>();
		ArrayList< Integer> bb=new ArrayList<>();
		int n1,n2,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the size of array 1: ");
		n1=sc.nextInt();
		System.out.println("Enter the first array elements: ");
		for(i=0;i<n1;i++)
		{
			aa.add(sc.nextInt());
		}
		System.out.println("Enter the size of array 2: ");
		n2=sc.nextInt();
		System.out.println("Enter the array 2 elements: ");
		for(i=0;i<n2;i++)
		{
			bb.add(sc.nextInt());
		}
		bb.removeAll(aa);
		aa.addAll(bb);
		System.out.println(aa);
		sc.close();

	}

}
