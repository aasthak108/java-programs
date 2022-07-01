class Node
{
	int data;
	Node next;
	Node(int x)
	{
		data = x;
		next = null;
	}
}
class LoopDetection
{
	static Node head;
	LoopDetection()
	{
		head = null;
	}
	public static int loopDetection(Node head)
	{
		Node s = head;
		Node f = head;
		int res=0;
		while(s!= null && f!= null &&f.next!= null)
		{
			s = s.next;
			f = f.next.next;
			if(s==f)
			{
				res =1;
			}
			if(res == 1)
			{
				return 1;
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		LoopDetection list = new LoopDetection();
		list.head= new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		list.head.next.next.next=list.head;;
		System.out.println(""+loopDetection(head));
	}
}
			
			
		