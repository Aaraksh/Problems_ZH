package set_papers_prg;

import java.util.Scanner;

public class BeUnique
{

	public static void main(String[] args) 
	{
		int i = 0,j=0,n1,n2,c=0;
		String s1,s2,ss="";
		char[] ch1;
		char[] ch2;
		char[] a; char[] b;
		int[] index;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		s1=sc.nextLine();
		
		System.out.println("Enter the String 1: ");
		s2=sc.nextLine();
		
		if(s1!="" && s2!="")
		{
			n1=s1.length();
			n2=s2.length();
			
			ch1=new char[n1];
			ch2=new char[n2];
			a=new char[n2];
			b=new char[n2];
			index=new int[n2];
			ch1=s1.toCharArray();
			ch2=s2.toCharArray();
			if(s1.equals(s2))
			{
				System.out.println("No Change");
			}
			else
			{
				for(i=0;i<n1;i++)
				{
					if(ch1[i]!=ch2[i])
					{
						a[j]=ch2[i];
						b[j]=ch1[i];
						index[j]=i+1;
						c++;
						j++;
					}
					else
						ss=ss+ch2[i];
					
					n2--;
				}
			}
			while(n2>0)
			{
				a[j]=ch2[i];
				j++;
				i++;
				n2--;
			}
			System.out.println("Remove: ");
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println("\nAfter Remove: \n"+ss);
			for(i=0;i<c;i++)
			{
				System.out.println(b[i]+" at "+index[i]);
			}
		}
		sc.close();
		

	}

}
