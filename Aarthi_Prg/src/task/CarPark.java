package task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class CarPark 
{
	static int i,j,n,k,count=0,flag=1;
	static String cno;
	static HashMap<String, Integer> h1=new HashMap<>();
	static HashMap<Integer, HashMap<String,Integer>> h2=new HashMap<>();
	static HashMap<String, HashMap<String, String>> h4=new HashMap<>();
	//static HashMap<String, String> h3=new HashMap<>();
	static Scanner sc=new Scanner(System.in);
	public static int leave()
	{
		{
			System.out.println(h4);
			System.out.println("Enter the car number to Leave: ");
			String str=sc.next();
			if(h1.containsKey(str))
			{
				System.out.println("Enter the time: ");
				String t=sc.next();
				calculate(str,t);
				h1.remove(str);
				count--;
			}
			else 
			{
				System.out.println("Enter the valid car number!!");
			}
		}
		return 0;
	}
	public static void calculate(String str,String t)
	{
		HashMap<String, String> h = h4.get(str);
		String s=h.keySet().toString();
		String s1=s.substring(1,s.length()-1);
		String s2=h.get(s);
		int ca=Math.abs(Integer.parseInt(s1)-Integer.parseInt(t));
		int amount = ((ca-1)*20)+10;
		h4.remove(str);
		h1.put(str, amount);
		System.out.println("*******************************************************************");
		System.out.println("\t\t\tCar Number: "+str);
		System.out.println("\t\t\tAmount: "+amount);
		System.out.println("*******************************************************************");
		System.out.println("\tCars in the Parking: "+h4);
		//System.out.println("In"+h4.get(str));
	}
	public static void carpark()
	{
			System.out.println("Enter the car number: ");
			cno=sc.next();
			h1.put(cno, 0);
			h2.put((count+1), h1);
			java.util.Date date = Calendar.getInstance().getTime();  
			DateFormat dateFormat = new SimpleDateFormat("hh");  
			String st = dateFormat.format(date);
			HashMap<String, String> h3=new HashMap<>();
			h3.put(st, "0");
			h4.put(cno, h3);
			count++;
	}

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of parkings available in a mall: ");
		n=sc.nextInt();
		while(true)
		{
			System.out.println("Choose the option:");
			System.out.println("\n\t1. Park the car \n\t2. Leave \n\t3.Exit");
			ch=sc.nextInt();
			if(ch==1)
			{
				if(count==n)
				{
					System.out.println("Sorry!! Parking is full!! Enter the valid option!!");
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
				System.exit(0);
			else
				System.out.println("Invalid Option!! Enter the valid option!!");
		}

	}

}
