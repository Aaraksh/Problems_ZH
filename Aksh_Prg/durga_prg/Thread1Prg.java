package durga_prg;

public class Thread1Prg extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(i+1);			
		}
	}
	
	public static void main(String[] args) 
	{
		Thread1Prg tt=new Thread1Prg();
		tt.start();

	}

}
