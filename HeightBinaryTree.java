class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
class HeightBinaryTree
{
	Node root;
	Height()
	{
		root = null;
	}
	public static int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			return 1+Math.max(height(root.left),height(root.right));
		}
	}
	public static void main(String[] args)
	{
		HeightBinaryTree tree = new HeightBinaryTree();
		tree = new Height();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(5);
		System.out.println("The height is " + height(tree.root));
	}
}
		