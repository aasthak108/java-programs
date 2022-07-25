
import java.util.*;
import java.io.*;
import java.lang.*;
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
class RemoveDuplicate
{
	static Node head;
	void removeDuplicate()
	{
		Node curr = head;
		if(curr==null)
	{
		return;
	}
		while(curr!= null)
		{
			if(curr.next!=null && curr.data == curr.next.data)
			{
				curr.next= curr.next.next;
			}
			else
			{
				curr = curr.next;
			}
		}
	}
	void printlist(Node curr)
	{
		curr = head;
		while(curr!=null)
		{
			System.out.println(curr.data + "");
			curr = curr.next;
		}
	}
	public static void main(String args[])
	{
		RemoveDuplicate list =new RemoveDuplicate();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(3);
		list.removeDuplicate();
		list.printlist(head);
	}
}
