package set_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Prg2_2
{
	public static void main(String[] args) 
	{
		int i,index=0;
		String s1;
		ArrayList<Integer> ff=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unbalanced String: ");
		s1=sc.next();
		for(i=1;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)=='(')
			{
				ff.add(index++, i);
				//index++;
			}
			if(s1.charAt(i)==')')
			{
				if(index!=0)
				{
					System.out.println(index);
					ff.remove(index-1);
					index--;
				}
				else
				{
					ff.add(index++, i);
				}
			}
		}
		for(i=0;i<s1.length();i++)
		{
			if(! ff.contains((int)i))
			{
				System.out.print(s1.charAt(i));
			}
					
		}
		sc.close();

	}

}
