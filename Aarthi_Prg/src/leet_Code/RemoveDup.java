package leet_Code;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDup 
{

	public static void main(String[] args) 
	{
		int[] ar= {1,1,2,3,4,5,5};
		int i;
		List<Integer> aa=new ArrayList<>();
		for(i=0;i<ar.length;i++)
		{
			if(!aa.contains(ar[i]))
				aa.add(ar[i]);
		}
		System.out.println(aa.size());
		
	}

}
