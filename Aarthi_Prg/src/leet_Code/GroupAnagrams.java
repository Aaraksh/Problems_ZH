package leet_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagrams 
{

	public static void main(String[] args) 
	{
		int i,n;
		String re;
		Map<String, List> ma=new HashMap<String, List>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		String[] ss=new String[n];
		System.out.println("Enter the strings: ");
		for(i=0;i<n;i++)
		{
			ss[i]=sc.next();
		}
		for(String s:ss)
		{
			if(ss.equals(""))
				ma.put(s, new ArrayList<String>());
			else
			{
				char[] a=s.toCharArray();
				Arrays.sort(a);
				re=String.valueOf(a);
				if(! ma.containsKey(re))
				{
					ma.put(re, new ArrayList<>());
					
				}
				ma.get(re).add(s);
			}
		}
		List<List> arr=new ArrayList<>(ma.values());
		System.out.println(arr);
		sc.close();

	}

}
