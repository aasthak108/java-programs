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
class LeftViewTree
{
	static Node root;
	LeftViewTree()
	{
		root = null;
	}
	static int max_level=0;
    public void leftViewTree(Node node,int level)
	{
		if(node == null)
		{
			return;
		}
		if(max_level<level)
		{
			System.out.println(""+node.data);
			max_level=level;
		}
		leftViewTree(node.left,level+1);
		leftViewTree(node.right,level+1);
	}
	public static void main(String args[])
	{
		LeftViewTree tree = new LeftViewTree();
		tree.root = new Node(10);
		tree.root.left = new Node(15);
		tree.root.left.left= new Node(16);
		tree.root.right = new Node(19);
		tree.root.right.right = new Node(14);
		tree.leftViewTree(tree.root,1);
	}
}
	