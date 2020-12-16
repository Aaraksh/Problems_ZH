package set_4;

import java.util.Scanner;

public class Prg4_1
{

	public static void main(String[] args) 
	{
		int start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number: ");
		start=sc.nextInt();
		System.out.println("Enter the end number: ");
		end=sc.nextInt();
		if(start%2 == 0)
			start++;
		while(start<end)
		{
			System.out.print(start+" ");
			start+=2;
		}
		sc.close();

	}

}
