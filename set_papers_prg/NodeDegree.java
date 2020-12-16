package set_papers_prg;

import java.util.Scanner;

public class NodeDegree 
{

	public static void main(String[] args) 
	{
		int i,n1,n2,j,k,len,c=0;
		char[] s1;
		String[] s2;
		int[] count;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of characters used: ");
		n1=sc.nextInt();
		s1=new char[n1];
		count=new int[26];
		
		System.out.println("Enter the number of edges: ");
		n2=sc.nextInt();
		s2=new String[n2];
		System.out.println("Enter the characters: ");
		for(i=0;i<n1;i++)
		{
			s1[i]=sc.next().charAt(0);
			
			
		}
		System.out.println("Enter the edges used: ");
		for(i=0;i<n2;i++)
		{
			s2[i]=sc.next();
			s2[i]=s2[i].toUpperCase();
		}
		for(i=0;i<n2;i++)
		{
			len=s2[i].length();
			if(len==1)
			{
					char ch=s2[i].charAt(0);
					count[ch-65]+=2;
					//System.out.println(a);
				
			}
			else
			{
				for(j=0;j<len;j++)
				{
					char ch=s2[i].charAt(j);
					count[ch-65]++;
				}
			}
		}
		for(i=0;i<n1;i++)
		{
			System.out.println(s1[i]+" - "+count[s1[i]-65]);
		}
		sc.close();
		

	}

}
