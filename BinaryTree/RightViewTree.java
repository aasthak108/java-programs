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
class RightViewTree
{
	static Node root;
	RightViewTree()
	{
		root = null;
	}
	static int max_level=0;
    public void rightViewTree(Node node,int level)
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
		rightViewTree(node.right,level+1);
		rightViewTree(node.left,level+1);
	}
	public static void main(String args[])
	{
		RightViewTree tree = new RightViewTree();
		tree.root = new Node(10);
		tree.root.left = new Node(15);
		tree.root.left.left= new Node(16);
		tree.root.right = new Node(19);
		tree.root.right.right = new Node(14);
		tree.rightViewTree(tree.root,1);
	}
}
	