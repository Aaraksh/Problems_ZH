package durga_prg;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
public class SysPrg 
{
	public static void main(String[] args) 
	{
	   long ms=System.currentTimeMillis();
	   System.out.println(ms);
	   Date dt=new Date(ms);
	   //System.out.println(dt);
	   SimpleDateFormat sd=new SimpleDateFormat("dd-MM-YYYY");
	   String ds=sd.format(dt);
	   System.out.println(ds);
	   Time tt=new Time(ms);
	   System.out.println(tt);
	   for(int i=1;i<=15;i++)
	   {
		   if(i==6)
		   {
			   System.out.println("Loop Break");
			    continue;
			   //System.exit(0);
		   }
		   else
			    System.out.println(i);
	   }
	}
}
