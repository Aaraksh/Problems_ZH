package durga_prg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollFrame 
{

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList<>();
		arr.add("Durga");
		arr.add(20);
		arr.add('A');
		arr.add(true);
		arr.add(null);
		System.out.println(arr);
		
		System.out.println(arr.size());
		System.out.println(arr.get(4));
		//System.out.println(arr.get(5));
		arr.remove(3);
		System.out.println("After Removal: "+arr);
		arr.add(3, true);
		System.out.println(arr);	
		arr.add(4, "Student");
		System.out.println(arr);
		
		
		ArrayList ar1=new ArrayList<>();
		ar1.add("Akshiya");
		ar1.add(19);
		ar1.add('B');
		ar1.add(true);
		ar1.add("Student");
		ar1.add(null); 
		System.out.println(ar1);
		
		//arr.addAll(ar1);
		//System.out.println("After adding two ArrayList: "+arr);
		//System.out.println(arr.retainAll(ar1));
		//arr.retainAll(ar1);
		//System.out.println("Using Retain function: "+arr);
		arr.removeAll(ar1);
		System.out.println("After using retainall function: "+arr);
		if(arr.isEmpty())
			System.out.println("EmptyCheck: "+true);
		
		LinkedList li1=new LinkedList<>();
		li1.add(21);
		li1.add("Academy");
		li1.add('A');
		li1.add(true);
		li1.add(null);
		//li1.addAll(arr);
		
		
		System.out.println("LinkedList 1: "+li1);
		
		LinkedList li2=new LinkedList<>();
		li2.add(22);
		li2.add("Class");
		li2.add('B');
		li2.add(true);
		li2.add(null);
		
		System.out.println("LinkedList 2: "+li2);
		
		Vector v=new Vector<>();
		v.add("Shivashri");
		v.add('A');
		v.add(2.3);
		v.add(20);
		System.out.println(v); 
		
		
	}

}
