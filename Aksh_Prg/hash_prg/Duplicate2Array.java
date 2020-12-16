package hash_prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate2Array
{

	public static void main(String[] args) 
	{
		int n1,n2,i,flag=1;
		Integer[] a;
		Integer[] b;
		String s1,s2,reg="\\d{1,10}";
		String[] ss1;
		String[] ss2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array1: ");
		s1=sc.next();
		System.out.println("Enter the size of Array2: ");
		s2=sc.next();
		if(s1.matches(reg) && s2.matches(reg))
		{
			n1=Integer.parseInt(s1);
			n2=Integer.parseInt(s2);
			a=new Integer[n1];
			ss1=new String[n1];
			b=new Integer[n2];
			ss2=new String[n2];
			System.out.println("Enter the elements of an Array1: ");
			for(i=0;i<n1;i++)
			{
				ss1[i]=sc.next();
				if(ss1[i].matches(reg))
					a[i]=Integer.parseInt(ss1[i]);
				else
					flag=0;
			}
			System.out.println("Enter the elements of an Array2: ");
			for(i=0;i<n2;i++)
			{
				ss2[i]=sc.next();
				if(ss2[i].matches(reg))
					b[i]=Integer.parseInt(ss2[i]);
				else
					flag=0;
			}
			if(flag==1)
			{
				ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(a));
				ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(b));
				
				for(int sa:arr1)
				{
					if(!(arr2.contains(sa)))
						System.out.println(sa+" "+arr1.indexOf(sa));
				}
				for(int sa:arr2)
				{
					if(!(arr1.contains(sa)))
						System.out.println(sa+" "+arr2.indexOf(sa));
				}

			}									
		}
		sc.close();
	}

}
