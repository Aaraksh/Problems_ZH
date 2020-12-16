package set_3;

import java.util.Scanner;

public class Prg3_1 
{

	public static void main(String[] args) 
	{
		String str,reg="[a-zA-Z0-9]+",reg1="[a-zA-Z]*",reg2="[0-9]*";
		int i,j,k,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.next();
		
		len=str.length();
		if(str.matches(reg))
		{
			str=str+"\0";
			for(i=0;i<len;i++)
			{
				if(str.substring(i, i+1).matches(reg1))
				{
					if(str.substring(i+1, i+3).matches(reg2))
					{
						k=Integer.parseInt(str.substring(i+1, i+3));
						//System.out.println("Key: "+k);
						for(j=0;j<k;j++)
						{
							System.out.print(str.charAt(i));
						}
						i+=2;
					}
					else
					{
						k=Integer.parseInt(str.substring(i+1, i+2));
						//System.out.println("Key: "+k);
						for(j=0;j<k;j++)
						{
							System.out.print(str.charAt(i));
						}
						i+=1;
					}
				}
			}
		}
		sc.close();
		

	}

}
