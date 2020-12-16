package set_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prg3_2
{

	public static void main(String[] args) 
	{
		int n,i;
		ArrayList<Integer> odd=new ArrayList<>();
		ArrayList<Integer> even=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		System.out.println("Enter the elements of a list: ");
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				odd.add(sc.nextInt());
			}
			else
			{
				even.add(sc.nextInt());
			}
			
		}
		Collections.sort(odd, Collections.reverseOrder());
		Collections.sort(even);
		System.out.println(odd);
		System.out.println(even);
		for(i=0;i<n/2;i++)
		{
			System.out.print(odd.get(i)+" ");
			System.out.print(even.get(i)+" ");
		}
		if((n%2)!=0)
		{
			System.out.println(odd.get(i));
		}
		sc.close();

	}

}
