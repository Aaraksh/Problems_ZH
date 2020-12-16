package hash_prg;

import java.util.HashMap;
import java.util.Map;

public class MapaddPrg 
{

	public static void print(Map<String, Integer> map)
	{
		if(map.isEmpty())
			System.out.println("Map is empty");
		else
			System.out.println(map);
	}
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map=new HashMap<>();
		print(map);
		map.put("Aarthi", 98);
		map.put("Akshiya", 99);
		map.put("Priya", 97);
		System.out.println("========================================");
		if(map.containsKey("Aarthi"))
		{
			Integer in=map.get("Aarthi");
			System.out.println("Aarthi "+in);
		}
		System.out.println("========================================");
		print(map);
		map.clear();
		System.out.println("========================================");
		print(map);

	}

}
