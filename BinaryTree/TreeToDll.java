class Node
{
	int data;
	Node left;
	Node right;
	Node(int x)
	{
		data = x;
		left = null;
		right = null;
	}
}
class TreeToDll
{
	static Node root;
	static Node head;
	static Node prev;
	public static void treeToDll(Node root)
	{
		if(root==null)
		{
			return;
		}
		treeToDll(root.left);
		if(prev==null)
		{
			head=root;
		}
		else
		{
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		treeToDll(root.right);
	}
	static void printlist(Node node)
	{
		if(root== null)
		{
			return;
		}
		while(node!=null)
		{
			System.out.println(""+node.data);
			node = node.right;
		}
	}
	public static void main(String args[])
	{
		TreeToDll tree = new TreeToDll();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(4);
		treeToDll(root);
		printlist(head);
	}
}
	