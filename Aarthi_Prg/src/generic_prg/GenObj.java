package generic_prg;


class Gene<T>
{
	T ob;
	public Gene(T o)
	{
		ob=o;
	}
	public T getobj()
	{
		return ob;
	}
	public void details()
	{
		System.out.println("T is the type of: "+ob.getClass().getName());
	}
}
public class GenObj 
{

	public static void main(String[] args) 
	{
		Gene<Integer> in=new Gene<Integer>(99);
		System.out.println("Using generics in integer datatype ");
		System.out.println("Number assigned: "+in.getobj());
		in.details();
		System.out.println("===================================================");
		System.out.println("Using generics in String type");
		Gene<String> ss=new Gene<String>("Aarthi");
		System.out.println("String assigned: "+ss.getobj());
		ss.details();
		

	}

}
