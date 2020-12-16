package set_1;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class S1P3 
{
	public static void grandchild(HashMap<String, String> map,String key,int n)
	{
		String str;
		int count=0;
		for(Map.Entry<String, String> ss:map.entrySet())
		{
			if(ss.getValue().equals(key))
			{
				str=ss.getKey();
				for(Map.Entry<String, String> mm:map.entrySet())
				{
					if(str.equals(mm.getValue()))
					{
						count++;
					}
				}
				break;
			}
		}
		System.out.println("No.of grand child for "+key+" is: "+count);
	}

	public static void main(String[] args) 
	{
		HashMap<String, String>hmap=new HashMap<>();
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pairs: ");
		n=sc.nextInt();
		System.out.println("Enter the pairs: ");
		for(i=0;i<n;i++)
		{
			hmap.put(sc.next(), sc.next());
		}
		System.out.println("Enter the name to find the grandchild: ");
		String key=sc.next();
		grandchild(hmap, key, n);
		sc.close();
	}

}
