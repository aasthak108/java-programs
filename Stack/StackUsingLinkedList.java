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
class StackUsingLinkedList
{
	Node top;
	StackUsingLinkedList()
	{
		top=null;
	}
	void push(int x)
	{
		Node temp = new Node(x);
		if(temp == null)
		{
			return;
		}
		temp.data = x;
		temp.next = top;
		top = temp;
	}
	void pop()
	{
		if(top== null)
		{
			return;
		}
		top = top.next;
	}
	int peek()
	{
		if(top==null)
		{
			return -1;
		}
		int result = top.data;
		return result;
	}
	void display()
	{
		if(top==null)
		{
			return;
		}
		Node temp = top;
		while(temp!=null)
		{
			System.out.println("Stack is "+ temp.data);
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(1);
		s.push(5);
		s.push(4);
		s.push(8);
		s.pop();
		s.display();
		System.out.println("The peek element is" + s.peek());
	}
}
	
		