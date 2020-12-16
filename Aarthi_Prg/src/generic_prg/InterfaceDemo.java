package generic_prg;

interface MinMax<T extends Comparable<T>>
{
	T min();
	T max();
}
public class InterfaceDemo<T extends Comparable<T>> implements MinMax<T>
{
	T[] val;
	InterfaceDemo(T[] n)
	{
		val=n;
	}
	
	@Override
	public T min() 
	{
		T mi=val[0];
		for(int i=0;i<val.length;i++)
			if(mi.compareTo(val[i]) >0)
				mi=val[i];
		return mi;
	}

	@Override
	public T max()
	{
		T ma=val[0];
		for(int i=0;i<val.length;i++)
			if(ma.compareTo(val[i]) <0)
				ma=val[i];
		return ma;
	}
	
	public static void main(String[] args) 
	{
		Integer[] num= {1,3,5,2,6};
	    InterfaceDemo<Integer> a=new InterfaceDemo<Integer>(num);
	    Character[] ch= {'a','g','k','o','p'};
	    InterfaceDemo<Character> b=new InterfaceDemo<Character>(ch);
	    System.out.println("Finding minimum and maximum numbers through integers: ");
	    System.out.println("Minimum number in an array: "+a.min());
	    System.out.println("Maximum number in an array: "+a.max());
	    System.out.println("\n===========================================\n");
	    System.out.println("Finding minimum and maximum in an character array: ");
	    System.out.println("Minimum character in an array: "+b.min());
	    System.out.println("Maximum character in an array: "+b.max());

	}

}
