package hash_prg;

import java.util.HashMap;
import java.util.TreeSet;

public class StrictHigher 
{
	
	public static void calculate(int n,Integer[] a,Integer[] b)
	{
		int i=0;
		TreeSet<Integer> tt=new TreeSet<Integer>();
		HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
		for(i=0;i<n;i++)
		{
			tt.add(a[i]);
			if(freq.containsKey(a[i]))
			{
				freq.put(a[i], freq.get(a[i])+1);
			}
			else
				freq.put(a[i], 1);
		}
		for(i=0;i<n;i++)
		{
			if(tt.higher(b[i])!=null)
			{
				System.out.print(tt.higher(b[i])+" ");
				
				if(freq.get(tt.higher(b[i]))==1)
				{
					tt.remove(tt.higher(b[i]));
				}
				else
				{
					freq.put(tt.higher(b[i]), freq.get(tt.higher(b[i]))-1);
				}
			}
			else
				System.out.print("null ");
			
		}
	}
	
	public static void main(String[] args) 
	{
		Integer a[]=new Integer[] { 9, 5, 100, 4, 89, 2, 0, 2, 89, 77, 77, 77 };
		Integer b[]= new Integer[] { 0, 18, 60, 34, 50, 29, 4, 20, 48, 77, 2, 8 };
		int n=a.length;
		calculate(n, a, b);

	}

}
