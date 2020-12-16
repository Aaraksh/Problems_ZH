package set_1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Prg_2 
{

	public static void main(String[] args) 
	{
	    int n,count=0,sq;
	    List<Integer> al=new LinkedList<Integer>();
	    HashMap<Integer, Integer> res=new HashMap<>();
	   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements: ");
	    n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	al.add(sc.nextInt());
	    }
	    for(int a:al)
	    {
	    	double s=Math.sqrt(a);
	    	sq=(int) (s-Math.ceil(s));
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
	    	res.put(count, a);
	    	count=0;
	    }
	    System.out.println(res);
	    TreeMap<Integer, Integer> tt=new TreeMap<>(res);

        
	    
	    sc.close();

	}

}
