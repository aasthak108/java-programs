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
class BSTinsertion
{
	static Node root;
	BSTinsertion()
	{
		root=null;
	}
	public Node bstInsertion(Node root,int data)
	{
		Node temp = new Node(data);
		if(root==null)
		{
			root=temp;
			return root;
		}
		Node curr = root;
		while(curr!=null)
		{
			if(data>curr.data)
			{
				curr = curr.right;
				if(curr.right==null)
				{
					curr.right = temp;
				}
			}
			if(data<curr.data)
			{
				curr = curr.left;
				if(curr.left == null)
				{
					curr.left = temp;
				}
			}
		}
		return root;
	}
	void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
			inorder(root.left);
			System.out.println(""+ root.data);
			inorder(root.right);
	}
	public static void main(String args[])
	{
		int data = 5;
		BSTinsertion tree = new BSTinsertion();
		tree.bstInsertion(root,10);
		tree.bstInsertion(root,9);
		tree.bstInsertion(root,11);
		tree.inorder(root);
	}
}
	
				