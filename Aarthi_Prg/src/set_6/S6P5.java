package set_6;
import java.util.Scanner;

public class S6P5
{

	public static void main(String[] args) 
	{
		int n1,n2,sum1,sum2;
		String s1,s2,reg="[0-9]+";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		s1=sc.next();
		System.out.println("Enter the second number:");
		s2=sc.next();
		if(s1.matches(reg) && s2.matches(reg))
		{
			n1=Integer.parseInt(s1);
			n2=Integer.parseInt(s2);
			sum1=n1+n2;
			s1=s1.replaceAll("0", "");
			if(s1.equals(""))
				s1="0";
			s2=s2.replaceAll("0", "");
			if(s2.equals(""))
				s2="0";
			sum2=Integer.parseInt(s1)+Integer.parseInt(s2);
			String d1 = Integer.toString(sum1).replaceAll("0", "");
			String d2 = Integer.toString(sum2).replaceAll("0", "");
			if(d1.equals(""))
				d1="0";
			if(d2.equals(""))
				d2="0";
			sum1=Integer.parseInt(d1);
			sum2=Integer.parseInt(d2);
			if(sum1==sum2)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("NotEqual");
			}
		}
		else
		{
			System.out.println("Error!!.. Invalid number.");
		}
		sc.close();

	}

}
