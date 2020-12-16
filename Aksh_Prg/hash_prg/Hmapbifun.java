package hash_prg;

import java.util.HashMap;
import java.util.Scanner;

public class Hmapbifun 
{
	//Example of computeIfPresent() function
	
	public static void count(int n,String[] ss,int[] va)
	{
		HashMap<String, Integer> hmap=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String keystr;
		int kcount;
		for(int i=0;i<n;i++)
		{
			hmap.put(ss[i], va[i]);
		}
		System.out.println("Enter the String key to find: ");
		keystr=sc.next();
		System.out.println("Enter the key count to increase: ");
		kcount=sc.nextInt();
		hmap.computeIfPresent(keystr, (key,val)->val+kcount);
		System.out.println(hmap);
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		
		String str;
		int len,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		String[] ss=str.split(" ");
		len=ss.length;
		int[] val=new int[len];
		for(i=0;i<len;i++)
		{
			System.out.println("Enter the value for string "+(i+1)+" :");
			val[i]=sc.nextInt();
		}
		count(len,ss,val);
		sc.close();
	}

}
