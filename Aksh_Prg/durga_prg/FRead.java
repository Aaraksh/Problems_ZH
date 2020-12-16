package durga_prg;

import java.io.File;
import java.io.FileReader;

public class FRead
{

	public static void main(String[] args) 
	{
		File fi=new File("d://class.txt");
		try
		{
			FileReader fr=new FileReader(fi);
			int l=(int)fi.length();
			char[] a=new char[l];
			fr.read(a);
			System.out.println(a);
			fr.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
