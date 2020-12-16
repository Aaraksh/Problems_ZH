package durga_prg;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Datastore 
{
	public static void main(String[] args) 
	{
	  String na,ph;
	  Scanner sc=new Scanner(System.in);
	  try
	  {
		  File fi=new File("D://durga.txt");
		  FileWriter fw=new FileWriter(fi,true);
		  System.out.println("Enter the name");
		  na=sc.next();
		  System.out.println("Enter the phone number");
		  ph=sc.next();
		  fw.write("/n"+na+"/t"+ph+"/n");
		  System.out.println("Name is "+na);
		  System.out.println("Phone Number is "+ph);
		  fw.close();
		  System.out.println("Record Saved");
		  sc.close();
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}
}
