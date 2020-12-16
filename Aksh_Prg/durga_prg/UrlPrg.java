package durga_prg;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlPrg 
{

	public static void main(String[] args) 
	{
		try
		{
			URL ur=new URL("https://www.gmail.com/default.aspx");
			System.out.println(ur.getPort());
			System.out.println(ur.getProtocol());
			System.out.println(ur.getHost());
			System.out.println(ur.getDefaultPort());
			System.out.println(ur.getFile());
			System.out.println(ur.getUserInfo());
			System.out.println(ur.toExternalForm());
		}
		catch (MalformedURLException ae) 
		{
			ae.printStackTrace();
		}
		

	}

}
