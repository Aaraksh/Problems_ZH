package zh;

import java.util.ArrayList;
import java.util.Scanner;

public class LeastPrime 
{

	public static void main(String[] args) 
	{
		String s1,s2;
		int i,j,c=1,n1,n2,k,key;
		String ss[],ss1[];
		int a[],b[];
		ArrayList<Integer> arr=new ArrayList<Integer>();             //InputFormat: [20,7] \n [11,5]
		Scanner sc=new Scanner(System.in);							 //O/P: [2,3] least prime no added to the num in arr1 
		System.out.println("Enter the String: ");					 //should be 0 when mod by the no in arr2
		s1=sc.nextLine();
		n1=s1.length();
		s1=s1.substring(1, n1-1);
		
		System.out.println("Enter the String: ");
		s2=sc.nextLine();
		n2=s2.length();
		s2=s2.substring(1, n2-1);
		
		//s1.trim();
		ss=s1.split(",");
		ss1=s2.split(",");
		
		a=new int[ss.length];
		b=new int[ss1.length];
		for(i=0;i<ss.length;i++)
		{		
			ss[i]=ss[i].trim();
			ss1[i]=ss1[i].trim();
			a[i]=Integer.parseInt(ss[i]);
			b[i]=Integer.parseInt(ss1[i]);
			//System.out.println(a[i]);
			//System.out.println(b[i]);
			key=a[i]%b[i];
			System.out.println("key: "+key);
			key=b[i]-key;
			System.out.println("key: "+key);
			System.out.println("========================");
			//System.out.println("key: "+key);
			//k=key+a[i];
			for(j=2;j<key;j++)
			{
				if(key%j==0)
				{
					c=0;
				}
			}
			if(c==1)
			{
				arr.add(key);
			}
			else
			{
				arr.add(1);
			}
			j=1;	
		}
		System.out.println(arr);
	}

}
