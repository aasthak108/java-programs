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
class LinkedList1
{
	Node head = null;
	Node tail = null;
	public void add(int data)
	{
		Node curr = new Node(data);
		if(head == null)
		{
			head = curr;
			tail= curr;
		}
		else
		{
			tail.next = curr;
			tail = curr;
		}
	}
	void insertAtBegin(int data)
	{
		Node curr = new Node(data);
		if(head==null)
		{
			head = curr;
		}
		else
		{
			curr.next = head;
			head = curr;
		}
	}
	void printlist()
	{
		Node curr = head;
		if(head == null)
		{
			System.out.println("List is empty");
		}
		while(curr!=null)
		{
		System.out.println(" " + curr.data);
		curr = curr.next;
		}
	}
	public static void main(String args[])
	{
		LinkedList1 list = new LinkedList1();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.printlist();
		list.insertAtBegin(8);
		list.printlist();
	}
}