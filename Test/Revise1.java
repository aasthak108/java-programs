import java.util.*;
import java.io.*;
import java.lang.*;
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
class Revise1
{
	static Node head;
	public static void insertAtBegin(Node head)
	{
		Node temp = new Node(6);
		temp.next=head;
		head = temp;
	}
	void printlist(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.data + "");
			node = node.next;
		}
	}
	public static void main(String args[])
	{
		Revise1 list = new Revise1();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.insertAtBegin(head);
		list.printlist(head);
	}
}
		