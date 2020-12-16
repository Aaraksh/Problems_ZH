package hash_prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicateStream
{
	
	public static void main(String[] args)
	{
		String s,reg="\\d{1,10}";
		int n,i,flag=1;
		String[] dd;
		Integer[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		s=sc.next();
		if(s.matches(reg))
		{
			n=Integer.parseInt(s);
			a=new Integer[n];
			dd=new String[n];
			System.out.println("Enter the elements of an array: ");
			for(i=0;i<n;i++)
			{
				dd[i]=sc.next();
				if(dd[i].matches(reg))
				{
					a[i]=Integer.parseInt(dd[i]);
				}
				else
					flag=0;
			}
			if(flag==1)
			{
				ArrayList< Integer> al=new ArrayList<>(Arrays.asList(a));
				List<Integer> li=al.stream().distinct().collect(Collectors.toList());
				System.out.println("After removing the duplicate elements: "+li);
			}
			
		}
		
		sc.close();

	}

}
