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
class BstFindLCA
{
	static Node root;
	public static Node findLCA(Node node,int a, int b)
	{
		if(node==null)	
		{
			return null;
		}
		if(node.data <a && node.data<b)
		{
			return findLCA(node.right,a,b);
		}
		if(node.data >a && node.data>b)
		{
			return findLCA(node.left,a,b);
		}
		return node;
	}
	public static void main(String args[])
	{
		BstFindLCA tree = new BstFindLCA();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(70);
		tree.root.left.left = new Node(10);
		int a =30;
		int b =70;
		Node t = findLCA(root,a,b);
		System.out.println("" + t.data);
	}
}