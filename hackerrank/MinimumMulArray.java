package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumMulArray 
{
	int n,i,j=0,k,flag=1,c=0;
	int[] ak; int[] bk;
	  
	public ArrayList<Integer> count(int a)
	{
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		
			k=a;
			c=0;
			//System.out.println(k+" "+i);
			while(k%2==0)
			{
				k/=2;
				c++;
			}
			li.add(c);
			c=0;
			
			while(k%3==0)
			{
				k/=3;
				c++;
			}
			li.add(c);
			c=0;
			
			while(k%7==0)
			{
				k/=7;
				c++;
			}
			li.add(c);
			c=0;
			
			li.add(k);
				
		
	/*	if(flag==0)
			System.out.println("No");
		else
			System.out.println("Yes");			*/
		return li;

	}

	public static void main(String[] args) 
	{
		
		int a,b,min=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		MinimumMulArray mm=new MinimumMulArray();
		ArrayList<Integer> aa=new ArrayList<Integer>();
		ArrayList<Integer> bb=new ArrayList<Integer>();
		aa=mm.count(a);
		
		bb=mm.count(b);
		
		if(aa.get(3)==bb.get(3))
		{
			min=Math.abs(aa.get(0)-bb.get(0))+Math.abs(aa.get(1)-bb.get(1))+Math.abs(aa.get(2)-bb.get(2));
			System.out.println(min);
		}
		
		else
			System.out.println("-1");
		sc.close();


	}

}
