package durga_prg;

import java.io.File;
import java.util.Scanner;

public class SRead
{

	public static void main(String[] args) 
	{
		File fi=new File("d://class.txt");
		try
		{
			Scanner sc=new Scanner(fi);
			while(sc.hasNext())
			{
				String ss=sc.next();
				System.out.println(ss);
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		

	}

}
