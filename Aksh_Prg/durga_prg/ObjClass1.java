package durga_prg;
public class ObjClass1
{
	String h;
	public ObjClass1(String n)
	{
		h=n;
	}
	public String toString()
	{
		System.out.println(super.toString());
		return h;
	}
	public int hashcode()
	{
		return 1;
	}
	public boolean equals(Object op)
	{
		return false;
	}
	public static void main(String[] args) 
	{
	  ObjClass1 obj1=new ObjClass1("Durga");
	  System.out.println(obj1);
	  String n=new String("Anu");
	  System.out.println(n);
	  System.out.println(obj1.hashcode());
	  System.out.println(obj1.equals(obj1));
	}
}
