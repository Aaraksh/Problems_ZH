package set_15;

import java.util.Scanner;

public class Prg15_3
{

	public static void main(String[] args) 
	{
		int n,l=0,r;
		char temp;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		n=str.length();
		char[] ch=str.toCharArray();
		r=n-1;
		while(l<r)
		{
			while( (l<r) &&  !( Character.isLetter(ch[l]) || Character.isDigit(ch[l])) )
			{
				l++;
			}
			while(  (r>l) && !(Character.isLetter(ch[r]) || Character.isDigit(ch[r])))
			{
				r--;
			}
			if(l<r)
			{
				temp=ch[r];
				ch[r]=ch[l];
				ch[l]=temp;
			}
			l++;
			r--;			
		}
		String res=String.copyValueOf(ch);
		System.out.println(res);
		sc.close();
	}

}
