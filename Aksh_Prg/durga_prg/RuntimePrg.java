package durga_prg;

public class RuntimePrg 
{

	public static void main(String[] args) 
	{
		Runtime rr=Runtime.getRuntime();
		System.out.println("Total Memory: "+rr.totalMemory());
		System.out.println("Free Memory: "+rr.freeMemory());
		System.out.println("Max Memory: "+rr.maxMemory());
		
		try
		{
			rr.exec("calc");
			//rr.exec("msword");
			rr.exec("notepad");
			rr.exec(new String[] {"cmd","/c","start chrome www.google.com"});
			rr.exec(new String[] {"cmd","/c","start firefox www.gmail.com"});
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
