package generic_prg;

class Getval <T1,T2>
{
	T1 o1;
	T2 o2;
	Getval(T1 a,T2 b)
	{
		o1=a;
		o2=b;
	}
	public T1 getName()
	{
		return o1;
	}
	public T2 getAge()
	{
		return o2;
	}
}
public class TwoParamEx 
{

	public static void main(String[] args) 
	{
		Getval<String,Integer> gg=new Getval<>("Aarthi", 22);
		String na=gg.getName();
		Integer age=gg.getAge();
		System.out.println("Name: "+na+"\nAge: "+age);

	}

}
