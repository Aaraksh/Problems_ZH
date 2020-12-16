package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Parking 
{
	static int i,j,n,k,count=0,flag=1;
	static String cno;
	
	static HashMap<String, Integer> h1=new HashMap<>();
	static HashMap<String, String> h2=new HashMap<>();
	static HashMap<String, HashMap<String,String>> h3=new HashMap<>();
	
	static Scanner sc=new Scanner(System.in);
	
	static Connection con;
	static ResultSet rs;
	static Statement st;
	
	public static void connection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.connection");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "");
		}
		catch(Exception e)
		{
			System.out.println("Error in DB connection: "+e);
		}
	}
	public static int leave()
	{
		System.out.println("\t\tEnter the car number to Leave: ");
		String str=sc.next();
		if(h1.containsKey(str))
		{
			System.out.println("\t\tEnter the time: ");
			String t=sc.next();
			HashMap<String, String> h4=new HashMap<>();
			h4.put(h2.get(str), t);
			h3.put(str, h4);
			calculate(str,t);
			count--;
		}
		else 
		{
			System.out.println("\t***********************************************************");
			System.out.println("\t\t    Invalid car number!!");
			System.out.println("\t\t    Cars in the parking: "+h2);
			System.out.println("\t***********************************************************");
		}
		return 0;
	}
		
	public static void calculate(String str,String t)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();    
		//System.out.println(h2);
		String s=h2.get(str);
		int ca=Math.abs(Integer.parseInt(s)-Integer.parseInt(t));
		int amount = ((ca-1)*20)+10;
		h1.put(str, amount);
		System.out.println("\t***********************************************************");
		System.out.println("\t\t\tDate       : "+java.time.LocalDate.now());
		System.out.println("\t\t\tTime       : "+dtf.format(now));
		System.out.println("\t\t\tCar Number : "+str);
		System.out.println("\t\t\tAmount     : "+amount);
		System.out.println("\t***********************************************************");
		h2.remove(str);
	}
	public static void carpark()
	{
			System.out.println("\t     Enter the car number to park: ");
			cno=sc.next();
			
			h1.put(cno, 0);
			java.util.Date date = Calendar.getInstance().getTime();  
			DateFormat dateFormat = new SimpleDateFormat("hh");  
			String st = dateFormat.format(date);
			System.out.println("\t***********************************************************");
			System.out.println("\t\tCar Number: "+cno+"     Parking Time: "+st);
			h2.put(cno, st);
			count++;
	}
	
	
	public static void avail()
	{
		if(h2.isEmpty())
			System.out.println("*****No cars available in the parking*****");
		else
		{
			System.out.println("\t***********************************************************");
			System.out.println("\tCar Number"+"  "+"Parking Time");
			for(Map.Entry<String, String> mm:h2.entrySet())
			{
				System.out.println("  "+mm.getKey()+"           "+mm.getValue());
			}
			System.out.println("\t***********************************************************");
		}
	}

	public static void main(String[] args) 
	{
		int ch;
		System.out.println("************************************CarParking************************************");
		System.out.println("\n               Enter the number of parkings available in a mall: ");
		n=sc.nextInt();
		while(true)
		{
			System.out.println("\t***********************************************************");
			System.out.println("\t\t\tChoose the option:");
			System.out.println("\t\t\t  1. Park the car \n\t\t\t  2. Leave \n\t\t\t  3. Cars in the Parking \n\t\t\t  4. Exit");
			System.out.println("\t***********************************************************");
			ch=sc.nextInt();
			if(ch==1)
			{
				if(count==n)
				{
					System.out.println("\t\tSorry!! Parking is full!! Enter the valid option!!");
				}
				else
				{
					carpark();
				}
			}
			else if(ch==2)
			{
				if(count==0)
				{
					System.out.println("Parking is empty!! Enter the valid option!!");
				}
				else
				{
					leave();
				}
			}
			else if(ch==3)
				avail();
			else if(ch==4)
			{
				System.exit(0);
			}
			else
				System.out.println("Invalid Option!! Enter the valid option!!");
		}

	}

}
