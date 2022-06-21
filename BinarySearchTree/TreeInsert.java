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
	public Node bstInsertion(Node root,int data)
	{
		Node temp = new Node(data);
		Node curr = root;
		if(curr==null)
		{
			curr=temp;
			return curr;
		}
		while(curr!=null)
		{
			if(data>curr.data)
				{
					curr = curr.right;
				}
			else if(data<curr.data)
				{
					curr = curr.left;
				}
		}
		return curr;
	}
}
class TreeInsert
{
	Node root;
	TreeInsert()
	{
		root = null;
	}
	 static void inorder(Node root)
		{
			Node curr = root;
			if(curr!=null)
			{
				inorder(curr.left);
				System.out.println(""+ curr.data);
				inorder(curr.right);
			}
		}
	public static void main(String args[])
	{
		int data = 5;
		Node curr = null;
		BSTinsertion insert = new BSTinsertion();
		TreeInsert tree = new TreeInsert();
		tree.root = curr;
		tree.root = new Node(10);
		tree.root.left = new Node(9);
		tree.root.left.left=new Node(2);
		tree.root.right = new Node(90);
		insert.bstInsertion(tree.root,data);
		tree.inorder(tree.root);
	}
}
	
				