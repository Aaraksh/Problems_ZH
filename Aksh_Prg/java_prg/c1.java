package java_prg;

import java.util.Scanner;

public class c1
{

	public static void main(String[] args) 
	{
	int n,i,a[],sum=0;
	System.out.println("enter how many elements");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements :");
	n=sc.nextInt();
	a=new int[n];
	System.out.println("Enter the elements: ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	i=0;
	while(i<n)
	{
		sum=sum+a[i];
		i++;
	}
	System.out.println("SUM: "+sum);
	sc.close();

	}

}
