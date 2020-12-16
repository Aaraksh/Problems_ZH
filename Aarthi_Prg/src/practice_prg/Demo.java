package practice_prg;


public class Demo 
{
	public static void main(String[] args) 
	{
		String str,sub,eq="\\\"/\\\"";
		str="abcdefghij\"/\"abcdefghij\"/\"";
		int n=10;
		while((n+2)<str.length())
		{
			sub=str.substring(n, n+3);
			if(sub.matches(eq))
			{
				str=str.substring(0, n)+str.substring(n+3);
			}
			n+=10;
		}
		System.out.println(str);		
	}

}


