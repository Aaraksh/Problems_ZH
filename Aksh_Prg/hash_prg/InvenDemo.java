package hash_prg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;



class ProductIn
{
	int pid,pprice,quan;
	float dis;
	String pname;
	ProductIn(int id,String na,int pr,int qt,float dd)
	{
		pid=id;
		pname=na;
		dis=dd;
		pprice=pr;
		quan=qt;		
	}
}

public class InvenDemo 
{
	Connection con;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;
	String sql,s1,s2,s3;
	
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Product> hmap=new HashMap<>();
	
	public void dbcon()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
			
		}
		catch(Exception e)
		{
			System.out.println("Error in database connection");
		}
	}
	
	public void add()
	{
		int id,amo,dis,qty;
		String name;
		System.out.println("Enter the product id: ");
		id=sc.nextInt();
		System.out.println("Enter the product name: ");
		name=sc.next();
		System.out.println("Enter the amount of the item: ");
		amo=sc.nextInt();
		System.out.println("Enter the discount of the product: ");
		dis=sc.nextInt();
		System.out.println("Enter the quantity of the item: ");
		qty=sc.nextInt();
		
		try
		{
			st=con.prepareStatement("insert into product values(?,?,?,?,?)");
		    
		}
		catch(Exception e)
		{
			System.out.println("Exception in add: "+e);
		}
		
	}
	public void remove()
	{
		int id;
		System.out.println("Enter the id you want to remove: ");
		id=sc.nextInt();
		try
		{
			pst=con.prepareStatement("delete from product where pid=?");
			pst.setInt(1, id);
			System.out.println("Successfully removed!!");
		}
		catch(Exception e)
		{
			System.out.println("Eoor in remove: "+e);
		}
	}
	public void view()
	{
		s2="select * from allinfo";
		try
		{
			st=con.createStatement();
			rs=st.executeQuery(s2);
			while(rs.next())
			{
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in view: "+e);
		}
		
	}
	public void billing()
	{
		int cid,pid,count;
		System.out.println("Enter the customer id: ");
		cid=sc.nextInt();
		System.out.println("Enter the product id: ");
		pid=sc.nextInt();
		System.out.println("Enter the count of the item: ");
		count=sc.nextInt();
		
		
		
	}
	public void audit()
	{
		
	}
	public void logout()
	{
		System.exit(0);
	}
	
	

	public static void main(String[] args) 
	{
		InvenDemo dd=new InvenDemo();
		dd.dbcon();

	}

}
