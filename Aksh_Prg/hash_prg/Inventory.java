package hash_prg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
class Product
{
	int pid,pprice,quan;
	float dis;
	String pname;
	Product(int id,String na,int pr,int qt,float dd)
	{
		pid=id;
		pname=na;
		dis=dd;
		pprice=pr;
		quan=qt;		
	}
}
public class Inventory 
{
	//static Scanner sc1=new Scanner(System.in);
	HashMap<Integer, Product>hh=new HashMap<>();
	Scanner sc1=new Scanner(System.in);
	public void add()
	{ 
		
		int id,price,qq;
		String name;
		float dd;
	//	HashMap<Integer, Product> hmap=new HashMap<>();
		
		System.out.println("Enter the product id: ");
		id=sc1.nextInt();
		System.out.println("Enter the Product name: ");
		name=sc1.next();
		System.out.println("Enter the quantity: ");
		qq=sc1.nextInt();
		System.out.println("Enter the discout: ");
		dd=sc1.nextFloat();
		System.out.println("Enter the Product Price: ");
		price=sc1.nextInt();
		
		if(hh.containsKey(id))
		{
			Product p=hh.get(id);
			p.quan=qq+p.quan;
			p.pprice=price;
			p.dis=dd;
//			System.out.println("Existed in");
		}
		else
		{
			Product pp=new Product(id, name, price, qq, dd);
			hh.put(id, pp);
//			System.out.println("New in");
		}
		/*for(Entry<Integer, Product> mm:hh.entrySet())
		{
			Product mypp=mm.getValue();
			System.out.println(mm.getKey()+" "+mypp.pid+" "+mypp.pname+" "+mypp.pprice+" "+mypp.quan);
		}*/
		System.out.println("Sucessfully addded!!");
		options();
		
	}
	public void remove()
	{
		int rid;
		System.out.println("Enter the id to remove: ");
		rid=sc1.nextInt();
		if(hh.containsKey(rid))
		{
			hh.remove(rid);
			System.out.println("Successfully removed!!");
		}
		else
		{
			System.out.println("Not an valid id!!");
		}
		options();
		
	}
	public void billing()
	{
		
	}
	public void view()
	{
		int cho=0;
		System.out.println("1.Id \n 2.Employee \n 3.Full view");
		System.out.println("Enter the view options(1,2,3): ");
		
		cho=sc1.nextInt();
		if(cho==1)
		{
			
		}
		else if(cho==1)
		{
			
		}
		else if(cho==2)
		{
			for(Entry<Integer, Product> mm:hh.entrySet())
			{
				Product mypp=mm.getValue();
				System.out.println(mm.getKey()+" "+mypp.pid+" "+mypp.pname+" "+mypp.pprice+" "+mypp.quan);
			}
		}
		options();	
		
	}
	public static void exit()
	{
		System.exit(0);
	}
	
	public void call()
	{
		int i,ch=0;
		Scanner sc=new Scanner(System.in);
		Product pro1=new Product(111, "Hamam", 25, 5, 5);
		hh.put(111, pro1);
		Product pro2=new Product(112, "Yardley", 65, 5, 3);
		hh.put(112, pro2);
		Product pro3=new Product(113, "Sanitizer", 55, 5, 6);
		hh.put(113, pro3);
		Product pro4=new Product(114, "Pencil", 15, 5, 2);
		hh.put(114, pro4);
		/*Product pro5=new Product(115, "Tipbox", 5, 5, 0);
		hh.put(115, pro5);*/
		
		/*for(Entry<Integer, Product> mm:hh.entrySet())
		{
			Product mypp=mm.getValue();
			System.out.println(mm.getKey()+" "+mypp.pid+" "+mypp.pname+" "+mypp.pprice+" "+mypp.quan);
		}*/
		options();
		
	}
	public void options()
	{
		int ch=0;
		System.out.println("1.Add \n 2.Remove \n 3.Billing \n 4.view \n 5.Exit");
		System.out.println("Enter the option(1,2,3,4,5): ");
		ch=sc1.nextInt();
		if(ch==1)
			add();
		else if(ch==2)
			remove();
		else if(ch==3)
			billing();
		else if(ch==4)
			view();
		else if(ch==5)
			exit();
	}
	
	public static void main(String[] args) 
	{		
		Inventory in=new Inventory();
		in.call();
		in.options();
	}

}
