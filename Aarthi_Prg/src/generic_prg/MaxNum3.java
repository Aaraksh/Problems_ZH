package generic_prg;

import java.util.Scanner;

public class MaxNum3
{
	public static <T extends Comparable<T>>T maximum(T a,T b,T c)
	{
		T max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b and c: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println("Maximum of three numbers: "+maximum(a,b,c));
		System.out.println("Maximum among decimal: "+maximum(1.1,5.5,5.3));
		System.out.println("Maximum among String: "+maximum("Apple","Carrot","Grapes"));
		sc.close();

	}

}
