package practice_prg;

import java.util.Scanner;


public class ProCon 
{
	static int mu=1,flag=0,noe=3,nof=0;
	
	public static void producer()
	{
		mu=wait(mu);
		nof=signal(nof);
		noe=wait(noe);
		flag++;
		System.out.println("Producer produces the item: "+flag);
		mu=signal(mu);
	}
	
	public static void consumer()
	{
		mu=wait(mu);
		nof=wait(nof);
		noe=signal(noe);
		flag--;
		System.out.println("Producer consumes the item: "+flag);
		mu=signal(mu);
	}
	
	public static int wait(int n)
	{
		return --n;
	}
	public static int signal(int n)
	{
		return ++n;
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Options available: ");
			System.out.println("\t1.Producer\n\t2.Consumer\n\t3.Exit");
			System.out.println("Enter your choice: ");
			n=sc.nextInt();
			switch (n) 
			{
				case 1:
					   if(mu==1 && noe!=0)
						   producer();
					   else
						   System.out.println("Buffer is full!!");	
			           break;
				case 2:
					   if(mu==1 && nof!=0)
							consumer();
					   else
						   System.out.println("Buffer is empty!!");
						break;
				case 3:
					   System.exit(0);
					   break;

				default:
					  break;
			}
		}
		
	}

}
