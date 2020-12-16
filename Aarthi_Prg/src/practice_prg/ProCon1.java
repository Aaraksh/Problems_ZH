package practice_prg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


class Producer
{
	int mu;
	public int prod(Queue<Integer> qq,int li) throws InterruptedException
	{
		while(true)
		{
			synchronized (this)
			{
				while(qq.size()==li)
					wait();
				
				Random r=new Random();
				mu=r.nextInt();
				notify();
				return(mu);
			}
		}
		
	}
}
class Consumer
{
	public void con(Queue<Integer> qq, int li) throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				while(qq.size()==0)
				{
					wait();
				}
				notify();
				Thread.sleep(500);
			}
		}
		
	}
}

class C
{
	static Queue<Integer> qq=new LinkedList<>();
	static int li=3;
	int g;
	Producer pp=new Producer();
	Consumer cc=new Consumer();
	public void func() throws InterruptedException
	{
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				try
				{
					g=pp.prod(qq,li);
					li++;
					if(qq.size()==3)
					qq.add(g);
					System.out.println("Producer produced: "+g);
					//Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println("Exception in producer: "+e);
				}
				
			}
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run()
			{
				try
				{
					cc.con(qq,li);
					li--;
					System.out.println("Consumer consumed: "+qq.peek());
					if(qq.size()!=0)
					   qq.remove();
					//Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println("Exception in consumer: "+e);
				}
				
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
public class ProCon1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
			C pp=new C();
			pp.func();
	}

}
