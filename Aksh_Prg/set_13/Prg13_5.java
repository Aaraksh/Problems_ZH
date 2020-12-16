package set_13;

import java.util.Scanner;

public class Prg13_5 
{

	public static void main(String[] args) 
	{
		int n,l,r;
		String str,res;
		char temp;
		char[] a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		n=str.length();
		a=new char[n];
		l=0;
		r=n-1;
		a=str.toCharArray();
		while(l<r)
		{
			while(!(  (Character.isLetter(a[l])) || (Character.isDigit(a[l])) ))
				l++;
			while(!(  (Character.isLetter(a[r])) || (Character.isDigit(a[r])) ))
				r--;
			
			temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			
			l++;
			r--;
		}
		res=String.valueOf(a);
		System.out.println(res);
		sc.close();

	}

}
