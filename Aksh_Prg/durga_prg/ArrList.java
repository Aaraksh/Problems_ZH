package durga_prg;
import java.util.ArrayList;
public class ArrList 
{
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add(12);
		ar.add(5.16);
		ar.add(true);
		ar.add('A');
		ar.add("Shivashri");
		ar.add(null);
		
		System.out.println(ar);
		System.out.println(ar.get(4));
		ar.set(4, "Raghu");
		System.out.println(ar);
		ar.add(4,"Shivashri");
		System.out.println(ar);
		
		ar.remove(3);
		System.out.println(ar);
		
		boolean a=ar.contains("Shivashri");
		System.out.println(a);
		
		Object dd=ar.clone();
		System.out.println(dd);
		
		ArrayList ar1=new ArrayList ();
		ar1=(ArrayList) ar.clone();
		ar1.add(76);
		ar1.add(54);
		ar1.remove(5);
		System.out.println(ar1);
	}
}
