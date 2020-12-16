package hash_prg;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DemoGrandChild 
{
	public static void calculate(HashMap<String, String>hm, String str,int n)
	{
		String ss="";
		for(Map.Entry<String, String> map:hm.entrySet())
		{
			if(map.getValue().equals(str))
			{
				ss=map.getKey();
				for(Map.Entry<String, String> mm:hm.entrySet())
				{
					if(Objects.equals(ss, mm.getValue()))
						System.out.println(mm.getKey());
				}							
			}
			
		}
	}

	public static void main(String[] args) 
	{
		int n,i;
		String child,father,key;
		HashMap<String, String> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of father child pairs: ");
		n=sc.nextInt();
		System.out.println("Enter the pairs: ");
		for(i=0;i<n;i++)
		{
			child=sc.next();
			father=sc.next();
			hm.put(child, father);
		}
		System.out.println("Enter the key to find: ");
		key=sc.next();
		calculate(hm,key,n);
		sc.close();

	}

}
