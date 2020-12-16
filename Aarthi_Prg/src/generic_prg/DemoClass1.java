package generic_prg;

class Gen <T>
{
	T ob;
	Gen(T o)
	{
		ob=o;
	}
	public T disp()
	{
		return ob;
	}
}
public class DemoClass1
{

	public static void main(String[] args) 
	{
		Gen<Integer> a=new Gen<>(100);
		Integer res1 = a.disp();
		System.out.println(res1);
		Gen<String> b=new Gen<>("Hundred");
		String res2 = b.disp();
		System.out.println(res2);

	}

}
