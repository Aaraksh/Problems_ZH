package durga_prg;

import java.util.Scanner;

public class SWrite
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner("Aar,Aksh,Dur");
		while(sc.hasNext())
		{
			String ss=sc.next();
			System.out.println(ss);
		}
		Scanner sc1=new Scanner("22 23 24");
		while(sc1.hasNext())
		{
			String age=sc1.next();
			System.out.println(age);
		}
		sc.close();
		sc1.close();
	}

}
