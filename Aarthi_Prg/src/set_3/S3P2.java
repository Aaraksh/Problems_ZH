package set_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S3P2
{

	public static void main(String[] args) 
	{
		int n,i,j=0,k=0;
		String s,reg="[0-9]+";
		ArrayList<Integer> od=new ArrayList<Integer>();
		ArrayList<Integer> ev=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		s=sc.next();
		if(s.matches(reg))
		{
			n=Integer.parseInt(s);
			System.out.println("Enter the elements of an array: ");
			for(i=0;i<n;i++)
			{
				if(i%2==0)
				{
					od.add(sc.nextInt());
				}
				else
				{
					ev.add(sc.nextInt());
				}
			}
			Collections.sort(od, Collections.reverseOrder());
			Collections.sort(ev);
			for(i=0;i<n;i++)
			{
				if(i%2==0)
				{
					System.out.print(od.get(j)+" ");
					j++;
				}
				else
				{
					System.out.print(ev.get(k)+" ");
					k++;
				}
			}
		}
		else
		{
			System.out.println("Invalid size!!");
		}
		sc.close();
	}

}
