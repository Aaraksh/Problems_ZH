package leet_Code;

import java.util.Scanner;

public class AddBinary 
{

	public static void main(String[] args) 
	{
		int l1,l2,s,ca=0;
		String s1,s2,m,n,res="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1: ");
		s1=sc.next();
		System.out.println("Enter the String2: ");
		s2=sc.next();
		l1=s1.length()-1;
		l2=s2.length()-1;
		while(l1>=0 || l2>=0)
		{
			m=(l1>=0)?s1.substring(l1, l1+1):"0";
			n=(l2>=0)?s2.substring(l2, l2+1):"0";
			s=(Integer.parseInt(m)+Integer.parseInt(n)+ca)%2;
			ca=(Integer.parseInt(m)+Integer.parseInt(n)+ca)/2;
			res=Integer.toString(s)+res;
			l1--;
			l2--;
		}
		if(ca>0)
			res=Integer.toString(ca)+res;
		System.out.println(res);
		sc.close();
	}

}
