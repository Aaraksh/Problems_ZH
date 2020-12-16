package set_5;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.TreeSet;

public class S5P3 
{

	public static void main(String[] args) 
	{
		int n1,n2,i;
		ArrayList<Integer> ar1=new ArrayList<>();
		ArrayList<Integer> ar2=new ArrayList<>();	
		ArrayList<Integer> ex=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of an array1: ");
		n1=sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n1;i++)
		{
			ar1.add(sc.nextInt());
		}
		System.out.println("Enter the no of elements of an array2: ");
		n2=sc.nextInt();
		System.out.println("Enter the elements of an array2: ");
		for(i=0;i<n2;i++)
		{
			ar2.add(sc.nextInt());
		}
		/*TreeSet<Integer> unn=new TreeSet<>();
		unn.addAll(ar1);    //union using Tree
		unn.addAll(ar2);
		System.out.println(unn);*/
		ArrayList<Integer> un=new ArrayList<>(ar1);
		for(i=0;i<n2;i++)
		{
			int nu=ar2.get(i);
			if(!un.contains(nu))
				un.add(nu);
		}
		System.out.println("Union: "+un);
		ArrayList<Integer> res=new ArrayList<>(ar1);
		res.retainAll(ar2);
		System.out.println("Intersection: "+res);
		for(int a:ar1)
		{
			if(a%2!=0)
				ex.add(a);
		}
		for(int a:ar2)
		{
			if(a%2==0)
				ex.add(a);
		}
		System.out.println("Except: "+ex );
		sc.close();

	}

}
