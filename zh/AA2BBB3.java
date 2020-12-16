package zh;

import java.util.Scanner;

public class AA2BBB3
{

	public static void main(String[] args) 
	{
		String ss;
		char[] a;
		int i,count=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		ss=sc.next();
		ss=ss+"\0";
		n=ss.length();
		
		a=ss.toCharArray();
		for(i=0;i<n && a[i]!='\0';i++)
		{
			
			while(a[i]!='\0' && (a[i]==a[i+1]))
			{
				count++;
				i++;
			}
			count++;
			//j++;	
			System.out.print(count+""+a[i]);
			count=0;
		}
	//	for(i=0;i<j;i++)
		{
			//System.out.println(ob[j].toString());
		}
		sc.close();

	}

}
