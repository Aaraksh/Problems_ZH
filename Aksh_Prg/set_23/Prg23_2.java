package set_23;

import java.util.Scanner;

public class Prg23_2
{
	public static boolean checknum(String str)
	{
		try
		{
			@SuppressWarnings("unused")
			int num=Integer.parseInt(str);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Enter the valid input!!");
			return false;
		}
	}

	public static void main(String[] args) 
	{
	    String str;
	    int num,r,ev=0,od=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    str=sc.next();
	    if(checknum(str))
	    {
	    	num=Integer.parseInt(str);
	    	while(num>0)
	    	{
	    		r=num%10;
	    		@SuppressWarnings("unused")
				int t=(r%2)==0?ev++:od++;
	    		num=num/10;
	    	}
	    	System.out.println("ODD: "+od);
	    	System.out.println("EVEN: "+ev);
	    	
	    }
	    sc.close();

	}

}
