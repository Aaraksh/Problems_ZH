package set_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class S6P1 
{

	public static void main(String[] args) throws ParseException 
	{
		String[] dd;
		//String reg="[0-9] {1,2} - [0-9] {1,2} - [0-9] {4}";
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of dates to enter: ");
		n=sc.nextInt();
		dd=new String[n];
		System.out.println("Enter the values of string: ");
		for(i=0;i<n;i++)
		{
			dd[i]=sc.next();
			/*if(dd[i].matches(reg))
			{
				System.out.println("yes");
			}*/
		}
		Date[] dat=new Date[n];
		SimpleDateFormat ss=new SimpleDateFormat("dd-MM-yyyy");
		for(i=0;i<n;i++)
		{
			dat[i]=ss.parse(dd[i]);
		}
		Arrays.sort(dat);
		for(i=0;i<n;i++)
		{
			dd[i]=ss.format(dat[i]);
		}
		for(i=0;i<n;i++)
		{
			System.out.println(dd[i]);
		}
		sc.close();

	}

}
