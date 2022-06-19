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
	Tree()
	{
		root=null;
	}
	BSTsearch search = new BSTsearch();
	public static void main(String args[])
	{
		Tree tree = new Tree();
		tree.root = new Node(10);
		tree.root.left = new Node(90);
		tree.root.left.left=new Node(2);
		tree.root.right = new Node(1);
		int data = 1;
		if(tree.search.bstSearch(root,data)!= null)
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
	Tree root = new Tree();
	public Node bstSearch(Node root,int data)
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
}

			
		
		