package zh;

public class OperPrg {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{

		int a=10;
		int b,c=10;
		//a=a+=10<=100?b=100:150;
		a=a+=10<=100?b=100:150;
		System.out.println(a+" "+b);
		
		System.out.println("--------------------");
		c+=10<=5?b=90:80;  //value of b is assigned to c
		System.out.println("value of c: "+c);
	}

}
