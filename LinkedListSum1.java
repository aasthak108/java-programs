class Node1
{
	int data;
	Node next;
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
}
public class LinkedListSum1
{
	Node head;
	Node tail;
	public LinkedListSum1()
	{
		head = null;
		tail = null;
	}
	public void add(int data)
	{
		if(data >=0)
		{
			Node current = new Node();
			current.setData(data);
			current.setNext(null);
			
			if(head == null)
			{
				head=current;
				tail=current;
			}
			else
			{
				tail.setNext(current);
				tail=current;
			}
		}
	}
	public static void main(String args[])
	{
		LinkedList LinkedList1 = new LinkedList();
		LinkedList LinkedList2 = new LinkedList();
		LinkedList1.add(1);
		LinkedList1.add(3);
		LinkedList2.add(3);
		LinkedList2.add(2);
		Node head1 = LinkedList1.head;
		Node head2 = LinkedList2.head;
		Node curr1 = head1;
		Node curr2 = head2;
		int sum=0;
		while(curr1 != null)
		{
			while(curr2 != null)
			{
			 
				{
					sum = curr1.data + curr2.data;
				}
				curr2 = curr2.next;
			}
			curr1 = curr1.next;
		}
		System.out.println(""+sum);
	}
}
			
			
			
			
			
			
			
			
	
	