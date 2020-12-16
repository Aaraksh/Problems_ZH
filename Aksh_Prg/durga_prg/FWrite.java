package durga_prg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWrite 
{

	public static void main(String[] args) 
	{
		String name,age; 
		//int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Enter the age: ");
		age=sc.next();
		
		try
		{
			File fi=new File("d://class.txt");
			FileWriter fw=new FileWriter(fi, true);
			//fw.write("\r\n"+name+" \r\n");
			//fw.write(age);
			fw.write("My name is "+name+"\r\n");
			fw.write("My age is "+age);
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		sc.close();
		
	}

}
