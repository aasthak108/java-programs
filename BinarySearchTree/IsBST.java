class Node
{
	int data;
	Node left,right;
	public Node(int item)
	{
		data= item;
		left=right=null;
	}
}
class IsBST
{
	static Node root;
	boolean isBST(Node node)
{
    if (node == null)
        return true;
    if (node.left != null && node.left.data > node.data)
        return false;
    if (node.right != null && node.right.data < node.data)
        return false;
    if (!isBST(node.left) || !isBST(node.right))
        return false;
    return true;
}
	
	public static void main(String args[])
	{
		IsBST tree = new IsBST();
		tree.root = new Node(10);
		tree.root.left = new Node(9);
		tree.root.left.left=new Node(2);
		tree.root.right = new Node(90);
		tree.isBST(root);
	}
}
	
		