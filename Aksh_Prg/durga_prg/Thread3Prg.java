package durga_prg;

public class Thread3Prg implements Runnable 
{

	public static void main(String[] args) 
	{
		Thread3Prg tt=new Thread3Prg();
		Thread tp=new Thread(tt);
		tp.start();
	}

	@Override
	public void run() 
	{
		System.out.println("Shivashri Academy!!");
		
	}

}
