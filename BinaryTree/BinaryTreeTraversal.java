
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
class BinaryTree
{
	Node root;
	BinaryTree()
	{
		root = null;
	}
	void preorder(Node node)
	{
		if(node ==null)
		{
			return;
		}
		System.out.println(node.key +"");
		preorder(node.left);
		preorder(node.right);
	}
	void inorder(Node node)
	{
		if(node ==null)
		{
			return;
		}
		preorder(node.left);
		System.out.println(node.key +"");
		preorder(node.right);
	}
	void postorder(Node node)
	{
		if(node ==null)
		{
			return;
		}
		preorder(node.left);
		preorder(node.right);
		System.out.println(node.key +"");
	}
	void postorder() {     postorder(root); }
    void inorder() {     inorder(root); }
    void preorder() {     preorder(root); }


	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(5);
		System.out.println("Preorder Traversal is");
		tree.preorder();
		System.out.println("inorder Traversal is");
		tree.inorder();
		System.out.println("postorder Traversal is");
		tree.postorder();
		
	}
}
