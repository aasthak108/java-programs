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
class FindLCA
{
	static Node root;
	FindLCA()
	{
		root = null;
	}
	public static Node findLCA(Node root,Node a,Node b)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data == a.data || root.data == b.data)
		{
			return root;
		}
		Node left = findLCA(root.left,a,b);
		Node right = findLCA(root.right,a,b);
		if(left!=null && right!=null)
		{
			return root;
		}
		if(left==null)
		{
			return right;
		}
		else
		{
			return left;
		}
	}
	public static void main(String args[])
	{
		FindLCA tree = new FindLCA();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		Node nodeA = new Node(20);
		Node nodeB = new Node(30);
		System.out.println("" + findLCA(root,nodeA,nodeB).data);
	}
}