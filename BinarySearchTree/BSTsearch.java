class Node
{
	int data;
	Node left,right;
	Node(int x)
	{
		data=x;
		left=right=null;
	}
}
class BSTsearch
{
	static Node root;
	BSTsearch()
	{
		root = null;
	}
	public static Node bstSearch(Node root,int data)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data == data)
		{ 
			return root;
		}
		if(data<root.data)
		{
			return bstSearch(root.left,data);
		}
		if(data>root.data)
		{
			return bstSearch(root.right,data);
		}
		return root;
	}
	public static void main(String args[])
	{
		BSTsearch tree = new BSTsearch();
		tree.root = new Node(10);
		tree.root.left = new Node(90);
		tree.root.right = new Node(1);
		int data = 1;
		if(tree.bstSearch(root,1) != null)
		{
			System.out.println("Node Found");
		}
		else
		{
			System.out.println("Node not found");
		}
			
	}
}
			
		
		
		
		
			