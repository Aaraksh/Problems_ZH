package durga_prg;
import java.io.File;
import java.util.Scanner;

public class ScanRead 
{
	public static void main(String[] args) 
	{
		try
		{
			File fi=new File("d://durga.txt");
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext())
			{
				String a=sc.next();
				String b=sc.next();
				System.out.println(a);
				System.out.println(b);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
