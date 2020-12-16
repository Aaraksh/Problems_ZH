package zh;

import java.util.Scanner;

public class HexAdd
{

	public static void main(String[] args) 
	{
	   int a,b,c = 0;
	   String d = null;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the integer value: ");
	   a=sc.nextInt(16);
	   //System.out.println(a);
	   b=sc.nextInt(16);
	   
	   if(a>=0xFFFFFF00 && a<=0x101 && b>=0xFFFFFF00 && b<=0x101)
	   {
		  // System.out.println("IN");
		   System.out.println(a);
		   System.out.println(b);
		   c=a+b;
		    d = Integer.toHexString(c);
	   }
	   System.out.println(c);
	   System.out.println(d);
	   sc.close();
	}

}
