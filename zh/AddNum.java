package zh;

import java.util.Scanner;

public class AddNum 
{

	public static void main(String[] args) 
	{
		int key,l;
		String ss="";
		String s,reg="[0-9]+",k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		s=sc.next();
		System.out.println("Enter the key value: ");
		k=sc.next();
		l=s.length();
		
		if(s.matches(reg) && k.matches(reg))
		{
			key=Integer.parseInt(k);
			while(l>0)
			{
				ss=Integer.toString(Character.getNumericValue(s.charAt(l-1))+key)+ss;
				l--;
			}
			System.out.println(ss);
		}
		else
		{
			System.out.println("Invalid input!!");
		}
		
		sc.close();
		

	}

}
