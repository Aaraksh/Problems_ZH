package practice_zh;

import java.util.Scanner;

public class Capital
{

	public static void main(String[] args) 
	{
		String s1,reg="[a-zA-Z\\s]*";
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Capitalize: ");
		s1=sc.nextLine();
		if(s1.matches(reg))
		{
			String[] ss=s1.split("\\s");
			for(String str:ss)
			{
				ss[i]=str.substring(0, 1).toUpperCase()+str.substring(1);
				System.out.print(ss[i]+" ");
				i++;
			}
		}
		sc.close();
	}

}
