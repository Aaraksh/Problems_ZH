package java_prg;

public class DPrg1 
{

	public static void main(String[] args) 
	{
		int i=1,j;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=5);
		
		System.out.println("=============================================");
		i=1;j=1;
		do 
		{
			do
			{
				System.out.println(i+"  "+j);
				j++;
			}while(j<=3);
			i++;
		}while(i<=3);
		
		System.out.println("=============================================");
		
		i=1;j=1;
		while(i<=3)
		{
			while(j<=3)
			{
				System.out.println(i+" "+j);
				j++;
			}
			i++;
		}
		
	}

}
