package set_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prg_5
{
	static int count;
	public static void search(HashMap<String, String>map,String skey,int n)
	{
		String str;
		for(Map.Entry<String, String> mm:map.entrySet())
		{
			if(mm.getValue().equals(skey))
			{
				str=mm.getKey();
				for(Map.Entry<String, String> ma:map.entrySet())
				{
					if(str.equals(ma.getValue()))
					{
						count++;
					}
				}
			}
		}
		System.out.println("Number of grandchildren for the given key is: "+count);
	}
	
	public static void main(String[] args) 
	{
		String s1,s2,s_key;
		int i,n;
		HashMap< String, String> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Child father pairs: ");
		n=sc.nextInt();
		System.out.println("Enter the child father pairs: ");
		for(i=0;i<n;i++)
		{
			s1=sc.next();
			s2=sc.next();
			map.put(s1, s2);
		}
		System.out.println("Enter the search key value: ");
		s_key=sc.next();
		search(map,s_key,n);
		sc.close();

	}

}
