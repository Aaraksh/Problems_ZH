package practice_prg;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Proex implements Runnable 
{
	private final BlockingQueue que;
	public Proex(BlockingQueue que)
	{
		this.que=que;
	}
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Random rr=new Random();
			try
			{
				int num=rr.nextInt();
				que.put(num);
				System.out.println("Produced: "+num);
				//Thread.sleep();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class Conex implements Runnable
{
	private final BlockingQueue que;
	public Conex(BlockingQueue que)
	{
		this.que=que;
	}
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Consumed: "+que.take());
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
	
	
}
public class ProCon2
{

	public static void procon()
	{
		BlockingQueue que=new LinkedBlockingQueue<>();
		Thread pro=new Thread(new Proex(que));
		Thread con=new Thread(new Conex(que));
		
		pro.start();
		con.start();
		
	}
	public static void main(String[] args) 
	{
		procon();

	}

}
