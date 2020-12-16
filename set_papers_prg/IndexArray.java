package set_papers_prg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IndexArray 
{

	public static void main(String[] args) 
	{
		int[] a;
		int[] in;
		int n,i;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		s=sc.next();
		if(Pattern.matches("[0-9]*", s))
		{
			n=Integer.parseInt(s);
			a=new int[n];
			in=new int[n];
			System.out.println("Enter the array elements: ");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				in[i]=a[i]%n;
				System.out.print(a[in[i]]+" ");
			}
		}
		else
		{
			System.out.println("Error");
		}
		sc.close();
	}

}
