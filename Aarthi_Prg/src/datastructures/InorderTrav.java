package datastructures;

public class InorderTrav
{
	class Node
	{
		int key;
		Node left,right;
		public Node(int item)
		{
			key=item;
			left=right=null;
		}
	}
	Node root;
	InorderTrav()
	{
		root=null;
	}
	void insert(int key)
	{
		root=insertrec(root,key);
	}
	Node insertrec(Node root, int key)
	{
		if(root==null)
		{
			root=new Node(key);
		}
		if(key<root.key)
		{
			root.left=insertrec(root.left,key);
		}
		else if(key>root.key)
		{
			root.right=insertrec(root.right,key);
		}
		return root;
	}
	public void traverse()
	{
		inorder(root);
	}
	
	public void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}

	public static void main(String[] args) 
	{
		int a[]= {5,2,1,4,3,6,7};
		InorderTrav tr=new InorderTrav();
		for(int i=0;i<a.length;i++)
		{
			tr.insert(a[i]);
		}
		System.out.println("Inorder Traversal of a BST: ");
		tr.traverse();

	}

}
