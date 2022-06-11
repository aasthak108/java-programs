class Node
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
public class LoopDetection
{
	Node head;
	Node tail;
	public LoopDetection()
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
	int count=0;
	int x=1;
	LinkedList givenLinkedList = new LinkedList();
	givenLinkedList.add(1);
	givenLinkedList.add(2);
	givenLinkedList.add(3);
	givenLinkedList.add(4);
	Node curr = givenLinkedList.head;
	while(curr != null)
	{
		count++;
		curr = curr.next;
	}
	System.out.println("Number of nodes are "+ count);
		while(count == 2)
		{
			count+count= 3;
			System.out.println("True");
		}		
}
}
		