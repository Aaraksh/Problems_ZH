package hash_prg;

import java.util.HashMap;
import java.util.Scanner;

public class YearAge 
{

	public static void main(String[] args) 
	{
		String ss;
		int y,i,n;
		HashMap<String, Integer> hmap=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of entries: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the name and year of birth for person :"+(i+1)+" :");
			ss=sc.next();
			y=sc.nextInt();
			hmap.put(ss, y);
		}
		hmap.replaceAll((key,val)->2020-val);
		System.out.println("Age of the persons: "+hmap);
		sc.close();
		
		

	}

}
