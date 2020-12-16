package set_21;

import java.util.Scanner;

public class Prg21_3Type2 
{

	public static void main(String[] args) 
	{
		String ss,reg="[aeiouAEIOU]";
		int len,l,r;
		char c1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.next();
		char[] a=ss.toCharArray();
		len=a.length;
		l=0;r=len-1;
		while(l<r)
		{
			while(!(ss.substring(l, l+1).matches(reg)) && (l<len) && (l<r))
			{
				l++;
				
			}
			while(!(ss.substring(r, r+1).matches(reg)) && (r>l))
			{
				r--;
			}
			c1=a[r];
			a[r]=a[l];
			a[l]=c1;
			l++;
			r--;
		}
		String str=String.copyValueOf(a);
		System.out.println(str);
		sc.close();
	}

}
