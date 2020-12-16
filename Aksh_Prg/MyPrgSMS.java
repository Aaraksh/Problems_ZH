import com.way2sms.SMS;

public class MyPrgSMS 
{

	public static void main(String[] args) 
	{
		SMS smsClient=new SMS();
		
		try
		{
			smsClient.send( "7010563532", "Aarthi98@123", "7010563532", "Hi Aaru","");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
