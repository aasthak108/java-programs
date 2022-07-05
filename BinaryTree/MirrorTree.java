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
class MirrorTree
{
	static Node root;
	public static void swap(Node root)
	{
		if(root == null)
		{
			return;
		}
		Node temp = root.left;
		root.left =root.right;
		root.right = temp;
	}
	public static void mirrorTree(Node root)
	{
		if(root == null)
		{
			return;
		}
		mirrorTree(root.left);
		mirrorTree(root.right);
		swap(root);
	}
	void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(""+root.data);
		inorder(root.right);
	}
	public static void main(String args[])
	{
		MirrorTree tree = new MirrorTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left =new Node(4);
		tree.root.right.right= new Node(5);
		tree.mirrorTree(root);
		tree.inorder(root);
	}
}