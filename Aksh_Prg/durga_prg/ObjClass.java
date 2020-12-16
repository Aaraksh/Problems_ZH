package durga_prg;
import java.util.ArrayList;
public class ObjClass 
{
	public void finalise()
	{
		System.out.println("Cleaned");
	}
	public static void main(String[] args) throws Throwable
	{
		ObjClass obj1=new ObjClass();
		ObjClass obj2=new ObjClass();
		System.out.println(obj1);
		System.out.println(obj2);
		//System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.equals(obj2));
		String n,m;
		n="Shiva";
		m="Shiva";
		if(n==m)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Different Names");
		}
		int [] nn= {3,4,5,6};
		int [] mm=nn.clone();
		for(int i:mm)
			System.out.println(i);
			
		ObjClass op1=new ObjClass();
		ObjClass op2=op1;
		op2=null;
		new ObjClass();
		op2.finalise();
		
		ArrayList ar=new ArrayList();
		ar.add(12);
		ar.add(5.6);
		ar.add(true);
		ar.add("ShivaShri");
		ar.add('A');
		System.out.println(ar);
		for(Object m1:ar)
		{
			System.out.println(m1);
		}
	}
}
