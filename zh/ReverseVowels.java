package zh;

import java.util.Scanner;

public class ReverseVowels 
{

	public static void main(String[] args) 
	{
	
		String s;
		int i=0,j=0,k=0,m=0,l=0;
		char[] a;
		char t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		s=sc.nextLine();
		l=s.length();
		a=new char[l];
		a=s.toCharArray();
		j=l-1;
		//for(k=0;k<l;k++)
		//{
			//if(i<j)
		   for(i=0;i<j;i++)
			{
				if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' )
				{
					for(m=j;m>i;m--,j--)
					{
						if(a[m]=='a' || a[m]=='e' || a[m]=='i' || a[m]=='o' || a[m]=='u')
						{
							t=a[i];
							a[i]=a[m];
							a[m]=t;
							j--;
							break;
						}
					}
					//j++;
				}
				//i++;
				//j++;
			}
			//i++;
		//}
		
		System.out.println("Rearranged array: ");
		for(i=0;i<l;i++)
		{
			System.out.println(a[i]);
		}
		
		//String ss=
		String ss=a.toString().valueOf(a);
		
		System.out.println("Reverse String is: "+ss);
		sc.close();
	}

}
