package set_2;

import java.util.Scanner;

public class S2P4 
{
	public static String check(char[] a,int n)
	{
		int i,j,c=0,flag=0,f=0,ch=0;
		int[] t=new int[n];
		String res="";
		if(a[0]=='(' && a[n-1]==')')
		{
			for(i=1;i<n-1;i++)
			{
				if(a[i]=='(')
				{
					t[c]=i;
					c++;
				}
				else if(a[i]==')')
				{
					if(c!=0)
					{
						c--;          
					}
					else
					{
						t[c]=i;
						c++;
						ch=1;     //To check ())ab)
						break;
					}
				}
				else if( a[i]=='+' || a[i]=='-' || a[i]=='*' || a[i]=='/')
				{
					
					if(!(a[i-1]>96 && a[i-1]<123)  ||  !(a[i+1]>96 && a[i+1]<123))
					{
						flag=1;
						break;
					}
				}			
				
			}
			if(flag==1)
			{
				return "Invalid Expression";
			}
			else if(ch==1)
			{
				return "Invalid Expression";
			}
			else
			{
				for(i=0;i<n;i++)
				{
					f=0;
					for(j=0;j<c;j++)
					{
						if(i==t[j])
							f=1;
					}
					if(f==0)
						res=res+a[i];
				}
				return res;
			}
		}
		return "Invalid Expression";
	}

	public static void main(String[] args) 
	{
		int n;
		String s,res,reg="[0-9a-zA-Z\\-/+//*%()]+";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expression to check: ");
		s=sc.next();
		if(s.matches(reg))
		{
			//System.out.println("Check Worked!!");
			n=s.length();
			char[] arr=s.toCharArray();
			res=check(arr,n);
			System.out.println("Result: "+res);
		}
		else
		{
			System.out.println("Invalid String!!");
		}
		sc.close();

	}

}
