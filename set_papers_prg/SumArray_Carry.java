package set_papers_prg;

import java.util.Scanner;

public class SumArray_Carry 
{

	public static void main(String[] args) 
	{
		int n1,n2,i,j=0,sum = 0,c=0,val=1;
		int[]a; int[] b; int[] ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1: ");
		n1=sc.nextInt();
		a=new int[n1];
		System.out.println("Enter the elements of array 1: ");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array 2: ");
		n2=sc.nextInt();
		b=new int[n2];
		
		if(n1>n2)
			ans=new int[n1];
		else
			ans=new int[n2];
		
		System.out.println("Enter the elements of array 2: ");
		for(i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		while(n1>0 && n2>0)
		{
			sum=(a[n1-1]+b[n2-1]+c)%10;
			c=(a[n1-1]+b[n2-1]+c)/10;
			//pre=(val*sum)+pre;
			//System.out.println(pre);
			ans[j]=sum;
			j++;
			val=val*10;
			n1--;
			n2--;
		}
		
		while(n1>0)
		{
			sum=(a[n1-1]+c)%10;
			c=(a[n1-1]+c)/10;
			//pre=(val*sum)+pre;
			ans[j]=sum;
			val=val*10;
			j++;
			
			n1--;
		}
		while(n2>0)
		{
			sum=(b[n2-1]+c)%10;
			c=(b[n2-1]+c)/10;
			//pre=(val*sum)+pre;
			//System.out.println(pre);
			ans[j]=sum;
			j++;
			val=val*10;
			n2--;
		}
		for(i=j-1;i>=0;i--)
		{
			System.out.print(ans[i]+" ");
		}		
		sc.close();
		

	}

}
