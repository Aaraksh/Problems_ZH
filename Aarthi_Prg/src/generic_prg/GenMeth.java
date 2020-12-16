package generic_prg;

public class GenMeth 
{
	static<T,V extends T> boolean check(T x,V[] y)
	{
		for(int i=0;i<y.length;i++)
		{
			if(x.equals(y[i]))
				return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		Integer num[]= {1,3,5,7,9,6};
		if(check(3,num))
			System.out.println("Number is present in an arrray!!");
		if(!check(2,num))
			System.out.println("2 is not present in an array!!");
		
		String[] str= {"Aar","Aks","Lav","Sow","Rek"};
		if(check("Aks",str))
			System.out.println("Given name is present in a string array!!");
		if(!check("Aaa",str))
			System.out.println("String \"Aaa\" is not present in an array!!");

	}

}
