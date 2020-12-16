package set_21;

import java.util.Scanner;

public class Prg21_3 
{

	public static void main(String[] args) 
	{
		int st=0,en=0,len;
		String ss,reg="[aeiouAEIOU]";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.next();
		char temp;
		char[] ch=ss.toCharArray();
		len=ch.length;
		while(en<len)
		{
			while((st<len)&& !(ss.substring(st, st+1).matches(reg)) && (st<=en) )
			{
				st++;
				en++;
			}
			en++;
			while((en<len) && !(ss.substring(en, en+1).matches(reg)) && (st<en))
				en++;
			//System.out.println(st+" "+en);
			if(en<len)
			{
				temp=ch[st];
				ch[st]=ch[en];
				ch[en]=temp;
				st=en;
			}
		}
		String res=String.copyValueOf(ch);
		System.out.println(res);
		sc.close();
		
	}

}
