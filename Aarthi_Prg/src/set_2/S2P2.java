package set_2;

import java.util.Scanner;

public class S2P2 
{
	public static String paran(char[] a,int len)
	{
		int count=0,i,j,flag,ch=0;
		int[] tt=new int[len];
		String ss="";
		if(a[0]=='(' && a[len-1]==')') //checking this becoz it willbe wrong if given as )a+b(
		{
			for(i=1;i<len-1;i++)
			{
				
				if(a[i]=='(')
				{
					tt[count]=i;
					count++;
					ch=1;
				}
				if(a[i]==')')
				{
					/*if(ch==0)
						ch=0;*/
					if(count!=0 && ch==1)
					{
						count--;
						ch=0;
					}
					else 
					{
						tt[count]=i;
						count++;
					}
				}
			}
			for(i=0;i<len;i++)
			{
				flag=0;
				for(j=0;j<count;j++)
				{
					if(i==tt[j])
						flag=1;
				}
				if(flag==0)
					ss=ss+a[i];
			}
		}
		else
			ss="Invalid input";
		return ss;
		
	}

	public static void main(String[] args) 
	{
		int n;
		String s,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=sc.next();
		n=s.length();
		char[] a=s.toCharArray();
		res=paran(a,n);
		System.out.println(res);
		sc.close();
	}

}
