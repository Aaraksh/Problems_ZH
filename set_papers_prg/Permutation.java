package set_papers_prg;

import java.util.Scanner;

public class Permutation
{

	public String swap(String a, int i,int j)
	{
		char[] b;
		char temp;
		b=a.toCharArray();
		temp=b[i];
		b[i]=b[j];
		b[j]=temp;
		return String.valueOf(b);		
	}
	public void permute(String a,int l,int r)
	{
			
		if(l==r)
			System.out.println(a);
		else
		{
			for(int i=l;i<=r;i++)
			{
				a=swap(a,l,i);	
				permute(a,l+1,r);
				//System.out.println(str);
				a=swap(a,l,i);
			}
		}
	}
	public static void main(String[] args) 
	{
		int n;
		String s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		n=s.length();
		Permutation pp=new Permutation();
		pp.permute(s, 0, n-1);
		sc.close();			
	

	}		
	
	
	

}
