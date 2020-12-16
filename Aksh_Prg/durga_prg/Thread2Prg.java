package durga_prg;

public class Thread2Prg extends Thread 
{
	public void run() 
	{
		int i;
		
		try
		{
			for(i=0;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println("Shivashri");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		Thread2Prg tp=new Thread2Prg();
		tp.start();

	}

}
