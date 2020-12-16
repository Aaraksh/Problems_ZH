package zh;

import java.util.Scanner;

public class SetUnset 
{

	public static void main(String[] args) 
	{
	
		String str="";
		int n,r,s=0,u=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%2;
			if(r==1)
				s++;
			else
				u++;
			n=n/2;
			str=r+str;
		}
		System.out.println(str);
		System.out.println("Set bits:"+s);
		System.out.println("Unset bits:"+u);
		sc.close();
	}

}
