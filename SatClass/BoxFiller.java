package SatClass;

import java.util.Scanner;

public class BoxFiller 
{

	public static void main(String[] args) 
	{
	
		int i,j,k,k1,row,col;
		char a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of row: ");
		row=sc.nextInt();
		System.out.println("Enter the column value: ");
		col=sc.nextInt();
		System.out.println("Enter the character: ");
		a=sc.next().charAt(0);
		k=a;
		k1=k;
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<col;j++)
			{
				if((k>=97 && k<=122) || (k>=65 && k<=90))
				{
					a=(char) k;
					System.out.print(a+" ");
					k++;
				}
				else
				{
					k=k-26;
					a=(char) k;
					System.out.print(a+" ");
					k++;
				}
				
			}
			k1=k1+1;
			k=k1;
		//	System.out.println("=============="+k+"================");
			System.out.println();
		}
		System.out.println(row+col-1);
		
		sc.close();
	}

}
