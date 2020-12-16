package hash_prg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Items
{
	int min,max,total,sum;
	Items(int price)
	{
		min=price;
		max=price;
		total=1;
		sum=price;
	}
}
public class ItemPurchase 
{

	public static void calculate(String[] ss,int[] cost,int n)
	{
		int i;
		HashMap<String, Items> map=new HashMap<>();
		for(i=0;i<n;i++)
		{
			if(map.containsKey(ss[i]))
			{
				Items pre=map.get(ss[i]);
				pre.max=Math.max(pre.max, cost[i]);
				pre.min=Math.min(pre.min, cost[i]);
				pre.total++;
				pre.sum=pre.sum+cost[i];
			}
			else
			{
				Items cc=new Items(cost[i]);
				map.put(ss[i], cc);
			}
		}
		System.out.println("Items\tMin\tMax\tAverage");
		for(Map.Entry<String, Items> mm:map.entrySet())
		{
			String str=mm.getKey();
			Items it=mm.getValue();
			float avg=((float)it.sum/(float)it.total);
			System.out.println(str+"\t"+it.min+"\t"+it.max+"\t"+avg);
		}
	}
	public static void main(String[] args) 
	{
		int n,i;
		int[] cost;
		String[] ss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items to be added: ");
		n=sc.nextInt();
		cost=new int[n];
		ss=new String[n];
		System.out.println("Enter the item and amount for "+n+" items:");
		for(i=0;i<n;i++)
		{
			ss[i]=sc.next();
			cost[i]=sc.nextInt();
		}
		calculate(ss,cost,n);
		sc.close();

	}

}
