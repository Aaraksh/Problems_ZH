package set_8_on;

import java.util.Scanner;

public class S8_P2 
{
	
	public static void find(char[] a1,char[] a2,int len)
	{
		String s1,s2;
		int i,j,k;
		s1=new String(a1);
		s2=new String(a2);
		for(i=0;i<len;i++)
		{
			if(a1[i]!=a2[i])
			{
				j=i+1;
				for(k=j;k<len;k++)
				{
					if(a1[k]!=a2[k])
					{
						continue;
					}
					else
						break;
				}
				System.out.println(s1.substring(i, k)+" , "+s2.substring(i, k));
				i=k-1;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int len,i;
		char[] a1;
		char[] a2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		len=sc.nextInt();
		a1=new char[len];
		a2=new char[len];
		System.out.println("Enter the elements of first array: ");
		for(i=0;i<len;i++)
		{
			a1[i]=sc.next().charAt(0);
		}
		System.out.println("Enter the elements of second array: ");
		for(i=0;i<len;i++)
		{
			a2[i]=sc.next().charAt(0);
		}	
		find(a1,a2,len);
		sc.close();
	}

}
