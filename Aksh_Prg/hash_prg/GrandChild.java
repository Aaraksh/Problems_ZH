package hash_prg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GrandChild 
{
	static int count=0;
	public static void search(HashMap<String, String> hm, String key,int n)
	{
		for(Map.Entry<String, String> map:hm.entrySet())
		{
			if(map.getValue().equals(key))
			{
				System.out.println(map.getKey());					
			}
		}
		//System.out.println("Count: "+count);
		
	}

	public static void main(String[] args) 
	{
		int n;
		String child,father,key;
		HashMap<String, String> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings: ");
		n=sc.nextInt();
		System.out.println("Enter the Strings: ");
		for(int i=0;i<n;i++)
		{
			child=sc.next();
			father=sc.next();
			hm.put(child, father);
		}
		System.out.println("Enter the String to search: ");
		key=sc.next();
		search(hm, key,n);
		sc.close();
	}

}