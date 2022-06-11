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
public class LinkedListSum
{
	Node head;
	Node tail;
	public LinkedListSum()
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
		LinkedListSum LinkedList1 = new LinkedListSum();
		LinkedListSum LinkedList2 = new LinkedListSum();
		LinkedList1.add(1);
		LinkedList1.add(1);
		LinkedList2.add(1);
		LinkedList2.add(1);
		int x=4,count =0;
		Node head1 = LinkedList1.head;
		Node head2 = LinkedList2.head;
		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1 != null)
		{
			while(curr2 != null)
			{
				if(curr1.data + curr2.data ==x)
				{
					count++;
				}
				curr2 = curr2.next;
			}
			curr1 = curr1.next;
		}
		System.out.println(""+count);
	}
}
			
			
			
			
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	