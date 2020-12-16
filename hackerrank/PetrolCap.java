package hackerrank;

import java.util.Scanner;

public class PetrolCap
{

	public static void main(String[] args) 
	{
		int a[],b[];
		String[]s;
		int i,k=0,cap,len;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial capacity of the car: ");
		cap=sc.nextInt();
		
		System.out.println("Enter the no of petrol bunks as letters with space: ");
		sc.next();
		s1=sc.nextLine();
		s=s1.split(" ");
		len=s.length;
		a=new int[len];
		
		System.out.println("Enter the distance from each petrol bunks for "+len+" bunks: ");
		for(i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		
		b=new int[len];
		
		System.out.println("Enter the capacity for "+len+" petrol bunks: ");
		for(i=0;i<len;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<len;i++)
		{
			if(cap>=a[i])
			{
				cap=cap-a[i];
				cap=cap+b[i];
				
			}
			else
			{
				System.out.println("You can't travel!!");
				k=1;
				break;
			}
		}
		if(k==0)
		{
			System.out.println("Petrol Capacity: "+cap);
		}
		sc.close();

	}

}
