package durga_prg;

import java.awt.Desktop;
import java.net.URI;

public class URIPrg 
{

	public static void main(String[] args) 
	{
		try
		{
			URI ur=new URI("www.gmail.com");
			
			Desktop dd=Desktop.getDesktop();
			//dd.browse(new URI("www.gmail.com"));
			dd.browse(ur);
			dd.browse(new URI("www.facebook.com"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
