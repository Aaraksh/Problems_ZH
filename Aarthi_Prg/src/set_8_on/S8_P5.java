package set_8_on;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S8_P5 
{
	public static int count(HashMap<String, String> hmap,String key,int n)
	{
		String str;
		int c=0;
		for(Map.Entry<String, String> li:hmap.entrySet())
		{
			if(li.getValue().equals(key))
			{
				str=li.getKey();
				for(Map.Entry<String, String> hh:hmap.entrySet())
				{
					if(hh.getValue().equals(str))
						c++;
				}
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int n,i,c;
		String s1,s2,key;
		HashMap<String, String> hmap=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pairs: ");
		n=sc.nextInt();
		System.out.println("Enter the father child pairs: ");
		for(i=0;i<n;i++)
		{
			s1=sc.next();
			s2=sc.next();
			hmap.put(s1, s2);
		}
		System.out.println("Enter the key name: ");
		key=sc.next();
		c=count(hmap,key,n);
		System.out.println("Number of grandchild of a given name: "+c);
		sc.close();
	}

}
