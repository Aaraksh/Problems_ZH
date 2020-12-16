package set_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class S1P2 
{
	
	public static void sortval(HashMap<Integer,Integer> hm)
	{
		List<Map.Entry<Integer,Integer>> li=new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
		Collections.sort(li,new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
			{
				return(o1.getValue()).compareTo(o2.getValue());
				//return 0;
			}
		});
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Entry<Integer, Integer> aa : li) { 
            temp.put(aa.getKey(), aa.getValue()); 
        }
        System.out.println(temp);
       // return temp; 
	}

	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		int n,i,count=0;
		List<Integer> aa = new LinkedList<>();
		HashMap<Integer,Integer> hh=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of a list: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			aa.add(sc.nextInt());
		}
		for(int a:aa)
		{
			double s = Math.sqrt(a);
			double sq=(s-Math.ceil(s));
			if(sq==0)
	    	{
	    		count+=5;
	    	}
	    	if((a%4==0) && (a/6)==0)
	    	{
	    		count+=4;
	    	}
	    	if(a%2==0)
	    	{
	    		count+=3; 
	    	}
	    	hh.put(a, count);
	    	count=0;
				
		}
		sortval(hh);
		sc.close();

	}

}
