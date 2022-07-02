import java.util.Queue;
import java.util.LinkedList;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int x)
	{
		data=x;
		left = null;
		right = null;
	}
}
class TreeInsertion
{
	static Node root;
	TreeInsertion()
	{
		root = null;
	}
	Node temp = root;
	public static void treeInsertion(Node temp,int data)
	{
		Queue <Node> q = new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty())
		{
			temp= q.poll();
			if(temp.left==null)
			{
				temp.left = new Node(data);
				break;
			}
			else
			{
				q.add(temp.left);
			}
			if(temp.right==null)
			{
				temp.right=new Node(data);
				break;
			}
			else
			{
				q.add(temp.right);
			}
		}
	}
	public static void inorder(Node temp)
	{
		if(temp == null)
		{
			return;
		}
		inorder(temp.left);
		System.out.println(" " + temp.data);
		inorder(temp.right);
	}
	public static void main(String args[])
	{
		root =new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		inorder(root);
		int data = 4;
		treeInsertion(root,data);
		inorder(root);
	}
}
		
		
	