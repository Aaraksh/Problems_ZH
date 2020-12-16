package zh;


import java.util.Scanner;

public class CountPrint_a1b5
{

	public static void main(String[] args) 
	{
		String s1,key="";
		int i,j,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s1=sc.nextLine();
		for(i=0;i<s1.length();i++)
		{
			//System.out.println("i value: "+i);
			if(s1.substring(i, i+1).matches("^[A-Za-z]+$"))
			{
				//System.out.println("String satisifies!!");
				key=s1.substring(i, i+1);
				//System.out.println("key: "+key);
				i=i+1;
				
			}
			if((i+2)<s1.length() && s1.substring(i, i+2).matches("^[0-9]+$"))
			{
				c=Integer.parseInt(s1.substring(i, i+2));
				//System.out.println("C: "+c);
				i+=1;
			}
			else
			{			
				c=Integer.parseInt(s1.substring(i, i+1));				
			}
			for(j=0;j<c;j++)
				System.out.print(key);
			
		}	
		sc.close();
	}

}
