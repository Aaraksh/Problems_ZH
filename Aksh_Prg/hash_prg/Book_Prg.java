package hash_prg;

import java.util.HashMap;
import java.util.Map;

class Book
{
	int id,quan;
	String name,auth,pub;
	public Book(int id,String name,String auth,String pub,int quan)
	{
		this.id=id;
		this.name=name;
		this.auth=auth;
		this.pub=pub;
		this.quan=quan;
	}
	
}
public class Book_Prg
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Book> map=new HashMap<>();
		//System.out.println("Enter the value of n: ");
		Book b1=new Book(1,"Let us C","Yashwant Kanetkar","BPB",8);    
		Book b2=new Book(2,"CNS","Forouzan","Mc Graw",4);    
		Book b3=new Book(3,"OS","Galvin","Wiley",6);   
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for(Map.Entry<Integer, Book> en: map.entrySet())
		{
			int a=en.getKey();
			Book b=en.getValue();
			System.out.println("key: "+a);
			System.out.println("Values: \n\t"+b.id+"-"+b.name+"-"+b.auth+"-"+b.pub+"-"+b.quan);
		}
		

	}

}
