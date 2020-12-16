package practice_interview;

import java.util.Scanner;

public class Pra1 
{

	public static void main(String[] args) 
	{
		int c=0,i,j,len;
		char ch = 0;
		char[] a;
		String s1,str,reg="[0-9]",reg1="^[a-zA-Z][0-9a-zA-Z]*[0-9]$";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s1=sc.next();
		a=s1.toCharArray();
		len=a.length;
		if(s1.matches(reg1))
		{
			for(i=0;i<a.length;i++)
			{
				if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122))
				{
					ch=a[i];
					i++;
				}
				if(Character.isDigit(a[i]))
				{
					if((i+1)<len && Character.isDigit(a[i+1]))
					{
						str=Character.toString(a[i])+Character.toString(a[i+1]);
						c=Integer.parseInt(str);
						i++;
					}
					else
					{
						str=Character.toString(a[i]);
						c=Integer.parseInt(str);
					}
				}
				for(j=0;j<c;j++)
				{
					System.out.print(ch);
				}
			}

		}
		else
		{
			System.out.println("Invalid string!");
		}
	}

}
