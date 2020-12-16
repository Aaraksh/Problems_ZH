package durga_prg;
import java.io.File;
import java.io.FileReader;
public class DataRead 
{
	public static void main(String[] args) 
	{
	   try
	   {
		   File fi=new File("d://durga.txt");
		   FileReader fr=new FileReader(fi);
		   long len=fi.length();
		   char[]ss=new char[(int) len];
		   fr.read();
		   System.out.println(ss);
		   fr.close();
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
}
