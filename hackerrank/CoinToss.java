package hackerrank;

import java.util.Scanner;

public class CoinToss 
{

	public static void main(String[] args) 
	{
		int n,head=0,tail=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of tosses performed: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(Math.random()>0.5)
				tail++;
			else
				head++;
		}
		System.out.println("Head: "+head+" Tail: "+tail);
		sc.close();
	}

}
