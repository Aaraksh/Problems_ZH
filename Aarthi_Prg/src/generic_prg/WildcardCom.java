package generic_prg;

class Com<T extends Number>
{
	T[] arr;
	Com(T[] a)
	{
		arr=a;
	}
	double average()
	{
		double sum=0.0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i].doubleValue();
		}
		return sum/arr.length;
	}
	boolean samecom(Com<?> obj)
	{
		if(average()==obj.average())
			return true;
		return false;
	}
}
public class WildcardCom 
{

	public static void main(String[] args) 
	{
		Integer[] a= {5,9,4,6,7};
		Com<Integer> a1=new Com<Integer>(a);
		System.out.println("Average of an integer array: "+a1.average());
		System.out.println("=========================================");
		Double[] b= {5.5,9.7,6.4,2.1,7.5};
		Com<Double> a2=new Com<Double>(b);
		System.out.println("Average of an double array: "+a2.average());
		System.out.println("=========================================");
		System.out.println("Checking the arrays are equal: ");
		if(a1.samecom(a2))
		{
			System.out.println("Both averages are same!!");
		}
		else
		{
			System.out.println("Both averages are different!!");
		}

	}

}
