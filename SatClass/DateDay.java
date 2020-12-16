package SatClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDay 
{

	 
	
	public static void main(String[] args) throws ParseException 
	{
		int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String da,date;
		int dat,mon,year,flag=0;
		//Date dd;
		String[] ss;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the date:(dd/MM/yyyy) ");
		da=sc.next();
		
		date=da;
		ss=da.split("/");
		
		dat=Integer.parseInt(ss[0]);
		mon=Integer.parseInt(ss[1]);
		year=Integer.parseInt(ss[2]);
	//	System.out.println(dat);
	//	System.out.println(mon);
	//	System.out.println(year);
		if(year>=1900 && year<=3000)
		{
			if(((year%4==0) && (year%100==0)) || (year%400==0))
			{
				day[1]++;
			}
			if(mon>0 && mon<=12)
			{
				if(dat>0 && dat<=day[mon-1])
				{
					flag++;
				}
			}							
		}
		if(flag>0)
		{
			
			System.out.println("valid date");
			//Date de=new Date();
			SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
			int xx = sd.parse(date).getDay();
			System.out.println("Day: "+days[xx]);
			SimpleDateFormat datfrm=new SimpleDateFormat("EEEE");
			//datfrm.format(dd);
			System.out.println();
			
		}
		else
			System.out.println("Invalid date");     
		
		sc.close();
	}

}
