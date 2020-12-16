package hash_prg;

import java.util.HashMap;
import java.util.Scanner;

public class GetValue 
{

	public static void main(String[] args) 
	{
		Integer a;
		String str;
		Scanner sc=new Scanner(System.in);
		HashMap< Integer, String> map=new HashMap<>();
		map.put(21, "TwentyOne");
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		str=map.get(a);
		System.out.println("The value is: "+str);
		sc.close();

	}

}
