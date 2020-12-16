package leet_Code;

import java.util.Scanner;

public class CountSay 
{
	public static int calculate(int row)
	{
		int rem=0,mul=1,k=0,c,num=row;
		while(num>0)
		{
			c=0;
			do
			{
				rem=num%10;
				num=num/10;
				c++;
			}while(rem==num%10);
			k=k+(c*10+rem)*mul;
			mul*=100;
		}
		return k;
	}
		
	
	
	public static int find(int row)
	{
		int i,num=0;
		if(row == 1)
			return 1;
		else
		{
			num=1;
			for(i=0;i<row-1;i++)
			{
				num=calculate(num);
			}
		}
		return num;
	}

	public static void main(String[] args) 
	{
		int num=1,row,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number to count: ");
		row=sc.nextInt();
		num=find(row);
		System.out.println(num);
		sc.close();
	}

}
