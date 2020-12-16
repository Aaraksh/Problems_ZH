package leet_Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Combination 
{
	static HashMap<String, String> ph=new HashMap<String, String>(){{
		put("2","abc");
		put("3","def");
		put("4","ghi");
		put("5","kjl");
		put("6","mno");
		put("7","pqrs");
		put("8","tuv");
		put("9","wxyz");
	}};
	//static List<String> li=new ArrayList<String>();
	public static List<String> combi(String com,String s,List<String> li)
	{
		if(s.length()==0)
			li.add(com);
		else
		{
			String d=s.substring(0, 1);
			String fi=ph.get(d);
			for(int i=0;i<fi.length();i++)
			{
				String le=fi.substring(i, i+1);
				combi(com+le , s.substring(1),li);
			}
		}
		//return li;
		return li;
	}
	
	public static void main(String[] args) 
	{
		String num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.next();
		List<String>li = new ArrayList<>();
		li=combi("",num,li);
		System.out.println(li);
		sc.close();
	}

}
