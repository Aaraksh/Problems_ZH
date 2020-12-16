package leet_Code;

import java.util.Scanner;

public class MulStrings 
{
	//Not working: 17*17
	public static void main(String[] args) 
	{
		int n1,n2,res=0,ca=0,i,j,k1=1,k2=0,f1=1,f2=1,sum=0,f=1;
		int c1,c2;
		String s1,s2,str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1: ");
		s1=sc.next();
		System.out.println("Enter the string2: ");
		s2=sc.next();
		n1=s1.length()-1;
		n2=s2.length()-1;
		
		for(i=n2;i>=0;i--)
		{
			f1=1;f2=1;k1=1;
			res=0;
			c1=(int)s2.charAt(i)-48;
			
			for(j=n1;j>=0;j--)
			{
				c2=(int)s1.charAt(j)-48;
				res=(((c1*c2)+ca)%10)*f1+res;
				ca=((c1*c2)+ca)/10;
				f1=(int) Math.pow(10, k1++);
			}
			
			if(ca!=0)
				res=res*f1;
			res=(int) (res*Math.pow(10, k2++));
			//System.out.println(res);
			sum=sum+res;
		}
       System.out.println(sum);		

	}

}
