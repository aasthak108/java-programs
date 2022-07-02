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
class TreeSearch
{
	Node root;
	TreeSearch()
	{
		root=null;
	}
	public static void main(String args[])
	{
		BSTsearch search = new BSTsearch();
		TreeSearch tree = new TreeSearch();
		tree.root = new Node(10);
		tree.root.left = new Node(9);
		tree.root.left.left=new Node(2);
		tree.root.right = new Node(90);
		int data = 90;
		if(search.bstSearch(tree.root,data)!= null)
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

			