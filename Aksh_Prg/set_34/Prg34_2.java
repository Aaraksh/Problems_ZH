package set_34;

import java.util.ArrayList;
import java.util.Scanner;

public class Prg34_2 
{
	/*public static char check(int n)
	{
		if(n>=58)
			return (char) (n-48);
		else
			return ((char) (n+'0'));
		
	}*/

	public static void main(String[] args) 
	{
		int[] a;
		int i,j,n,max=0,minmax=Integer.MAX_VALUE,flag=0;
		ArrayList<String> cc=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			max=0;
			minmax=Integer.MAX_VALUE;
			for(j=0;j<n;j++)
			{
				
				if(i!=j)
				{
					System.out.println(i+" "+j);
					if(a[i]<a[j])
					{
						System.out.println(i+" "+j+" "+a[j]);
						max=a[j];
						
						if(max<minmax)
						{
							minmax=max;
							flag=1;
						}
					}
				}
			}		
			if(flag==1)
			{
				//char te=check(minmax);  //to convert the numbers above 10 correctly as per the ascii value.
				cc.add(Integer.toString(minmax));
				flag=0;
			}
			else
				cc.add("_");
		}
		System.out.println(cc);
		sc.close();
		

	}

}
