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
class Tree
{
	static Node root;
	root=null;
	public static void main(String args[])
	{
		Tree tree = new Tree();
		tree.root = new Node(10);
		tree.root.left = new Node(90);
		tree.root.left.left=new Node(2);
		tree.root.right = new Node(1);
		int data = 1;
		Node search = new Tree().bstSearch(root,data);
		if(tree.search(root,1)!= null)
		{
			System.out.println("Node Found");
		}
		else
		{
			System.out.println("Node not found");
		}
	}
}
class BSTsearch
{
	public static Node bstSearch(Node root,int data)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data == data)
		{ 
			return tree;
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

			
		
		