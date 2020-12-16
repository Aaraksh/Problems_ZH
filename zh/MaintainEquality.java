package zh;

import java.util.Scanner;

public class MaintainEquality 
{

	public static void main(String[] args) 
	{
		String[] ss;
		int[] a;
		int[] b;
		String s1="";
		int i=0,j=0,n,n1=0,c=0,r=0,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		ss=new String[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			n1=a[i];
			while(n1!=0)
			{
				r=n1%10;
				c++;
				n1=n1/10;
			}
			b[i]=c;
			System.out.println(b[i]);
			c=0;
		}
		max=b[0];
		//finding maximum digit
		for(i=0;i<n;i++)
		{
			if(max<b[i])
			{
				max=b[i];
			}
			ss[i]=String.valueOf(a[i]);
		}
		//appending zeros
		for(i=0;i<n;i++)
		{
			while(ss[i].length()<max)
			{
				ss[i]="0"+ss[i];
			}
			String e=ss[i];
			for(j=ss[i].length()-1;j>=0;j--)
			{		
				s1=s1+e.charAt(j);
			}
			ss[i]=s1;
			s1="";
		//	System.out.println("String: "+ss[i]);
		}
		System.out.println("Output Array: ");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(ss[i]);
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
