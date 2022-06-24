import java.util.LinkedList;
import java.util.Queue;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int x)
	{
		data= x;
		left = null;
		right = null;
	}
}
class HeightIterative
{
	Node root;
	public int heightIterative(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int height =0;
		while(!q.isEmpty())
		{
			height++;
			int size = q.size();
			while(size>0)
				size--;
			{
				Node curr = q.poll();
				if(curr.left!= null)
				{
					q.add(curr.left);
				}
				if(curr.right!= null)
				{
					q.add(curr.right);
				}
			}
		}
		return height;
	}
	public static void main(String args[])
	{
		HeightIterative tree= new HeightIterative();
		tree.root = new Node(10);
		tree.root.left= new Node(9);
		tree.root.right = new Node(8);
		tree.heightIterative(tree.root);
	}
}
		