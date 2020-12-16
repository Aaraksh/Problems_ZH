package java_prg;

import java.util.Scanner;

public class DoubleArr 
{

	public static void main(String[] args) 
	{
		int i,j;
		//int[][] a= {{1,2,3},{4,5,6}};
		int[][] a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}	
			System.out.println();
		}
		sc.close();

	}

}
