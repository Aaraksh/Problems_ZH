package hash_prg;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Employee 
{
	public static LinkedHashMap<String, String> check(LinkedHashMap<String, String> li,String key)
	{
		String s1,s2;
		LinkedHashMap<String, String> res=new LinkedHashMap<>();
		Iterator< String> ite=li.keySet().iterator();
		while(ite.hasNext())
		{
			s1=ite.next();
			s2=li.get(s1);
			if(s2.equals(key))
				res.put(s1, s2);
		}
		
		return res;
	}
	
	public static void main(String[] args) 
	{
		int n,i,flag=1;
		String name,desc,key,str1;
		LinkedHashMap<String, String> li=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		System.out.println("Enter the name and designation of the employee: ");
		for(i=0;i<n;i++)
		{
			name=sc.next();
			desc=sc.next();
			li.put(name, desc);
		}
		System.out.println("Enter the designation to find: ");
		key=sc.next();
		LinkedHashMap<String, String> res=new LinkedHashMap<>();
		res=check(li,key);
		Iterator< String> ite=res.keySet().iterator();
		while(ite.hasNext())
		{
			str1=ite.next();
			System.out.println(str1);
			flag=0;
		}
		if(flag==1)
			System.out.println("NoOne is present in the given Designation");
		sc.close();
		
	}

}
