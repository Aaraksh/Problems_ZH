package set_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Prg4_7
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		int i,j,n,count=0;
		int[] arr;
		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
					count++;
			}
			//map.put(arr[i], count);
			map.put(count, arr[i]);
			count=0;
		}
		//System.out.println(map);
		TreeMap<Integer, Integer> tt=new TreeMap<Integer, Integer>(map);
		
		Iterator ite=tt.keySet().iterator();
		while(ite.hasNext())
		{
			int k=(int)ite.next();
			System.out.print(map.get(k)+" ");
		}
		sc.close();
	}

}
