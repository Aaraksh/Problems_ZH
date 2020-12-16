package leet_Code;

import java.util.Scanner;

public class IntegerReverse 
{
	public static int reverse(int x) 
    {
        if(x>=Math.pow(-2,31) && x<=(Math.pow(2,31)-1))
        {
            int sum=0,rem=0,flag=0,n,sig=1;
            
            n=x;
            if(x<0)
            {
            	n=-n;
            	sig=-1;
            }
            while(n!=0)
            {
            	rem=n%10;
            	sum=sum*10+rem;
            	n=n/10;
            }       
            return sum*sig;
        }
        else
            return 0;
    }

	public static void main(String[] args) 
	{
		int num,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		res=reverse(num);
		System.out.println(res);
		sc.close();

	}

}
