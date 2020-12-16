package datastructures;

public class LinkedList 
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedList insert(LinkedList list,int d)
	{
		Node newnode= new Node(d);
		newnode.next=null;
		
		
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;			
			}
			last.next=newnode;
		}
		return list;
	}
	
	public static void print(LinkedList list)
	{
		Node curr=list.head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		
		print(list);

	}

}
