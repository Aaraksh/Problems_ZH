package generic_prg;

class Genbound<T extends Number> //we cannot able to pass string value because it extends the Number.
{                                //so only its superclass or subclass types only allowed. 
	T[] a;
	public Genbound(T[] ar)
	{
		a=ar;
	}
	public double average()
	{
		double sum=0.0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i].doubleValue();
		}
		
		return sum/a.length;
	}
}

public class GenNum 
{

	public static void main(String[] args) 
	{
		System.out.println("Passing array of integers: ");
		Integer[] a= {1,2,3,4,5};
		Genbound<Integer> a1=new Genbound<Integer>(a);
		System.out.println("Average of integers is: "+a1.average());
		System.out.println("====================================");
		System.out.println("Passing array of double values");
		Double[] b= {6.8,9.9,4.8,2.9,7.5};
		Genbound<Double> a2=new Genbound<Double>(b);
		System.out.println("Average of Double values is: "+a2.average());
		

	}

}
