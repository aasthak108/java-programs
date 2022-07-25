import java.util.*;
class Node
{
	int data;
	Node next;
	public Node(int item)
	{
		data= item;
		next = null;
	}
}
class Revise
{
	static Node head;
	public static Node insert(int data)
	{
		Node temp= new Node(data);
		if(head == null)
		{
			head = temp;
		}
		else
		{
		head.next = temp;
		temp.next = null;
		}
		return head;
	}
	public static void print()
	{
		Node curr = null;
		if(head == null)
		{
			return;
		}
		head = curr;
		while(curr!=null)
		{
			System.out.println(""+ curr.data);
			curr = curr.next;
		}
	}
	public static void main(String args[])
	{
		Revise l = new Revise();
		l.insert(1);
		l.insert(2);
		l.print();
		
	}
}
		
	