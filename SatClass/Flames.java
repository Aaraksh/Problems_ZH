package SatClass;

import java.util.Scanner;

public class Flames
{

	public static void main(String[] args)
	{
		String s1,s2;
		char[] a;
		char[] b;
		String[] flames= {"Friends","Lovers","Affection","Marriage","Enemies","Sisters"};
		int n1,n2,i,j,k,l,sum,flag=0,count=0,len,s=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name1: ");
		s1=sc.nextLine();
		System.out.println("Enter the Name2: ");
		s2=sc.nextLine();
		n1=s1.length();
		n2=s2.length();
		len=flames.length;
		s1.toLowerCase();
		s2.toLowerCase();
		a=s1.toCharArray();
		b=s2.toCharArray();
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(a[i]==b[j])
				{
					for(k=i;k<n1-1;k++)
					{
						a[k]=a[k+1];
					}
					n1--;
					for(l=j;l<n2-1;l++)
					{
						b[l]=b[l+1];
					}
					n2--;
					j=0;
				}
				
			}
		}
		sum=n1+n2;
		System.out.println("Sum: "+sum);
		k=0;
		for(i=0;i<5;i++)
		{
			
			c=sum;
			for(j=0;j<c;j++)
			{
				//System.out.println("j: "+j+"  k:"+k);
				if(flames[k].equals("0"))
				{
					
					c++;
					System.out.println("c: "+c+"   i:"+i);
				}
				
				if(k==5)
				{
					k=-1;
				}
				k++;
			}
			//System.out.println("In: "+flames[k-1]);
			if((k-1)<0)
			{
				l=5;
				for(int m=l ;m>0; m++)
				{
					if(!flames[m].equals("0"))
					{
						flames[m]="0";
						break;
					}
				}
					
			}
			else
			{
				flames[k-1]="0";
			}
			
			//System.out.println("KF: "+k);
		}
		for(i=0;i<5;i++)
		{
			if(!(flames[i].equals("0")))
				System.out.println(flames[i]);
		}
				
		sc.close();
	}

}
