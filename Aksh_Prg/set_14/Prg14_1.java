package set_14;

import java.util.Scanner;

public class Prg14_1 
{

	public static void main(String[] args) 
	{
		String n,reg="[0-9]+",str="";
		int num,r = 0,q;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.next();
		if(n.matches(reg))
		{
			num=Integer.parseInt(n);
			q=num;
			while(q>0)
			{
				r=q%26;
				q=q/26;
				str=Character.toString((char)(r+64))+str;
			}
		    //str=str+Character.toString((char)(r+64));
		}
		System.out.println(str);
		sc.close();
	}

}
