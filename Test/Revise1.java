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
	public static void insertAfter(Node node)
	{
		Node temp = new Node(6);
		temp.next=node.next;
		node.next=temp;
	}
	public static int count(Node head)
	{
		int c=0;
		Node curr = head;
		while(curr!=null)
		{
			curr = curr.next;
			c++;
		}
		return c;
	}
	public static Node midNode(Node head)
	{
		int l;
		Node mid = head;
		int count=1;
		int length = count(head);
		if(length%2==0)
		{
			l = length/2;
		}
		else
		{
			l = (length/2)+1;
		}
		System.out.println("the middle length is "+l);
		while(count<l)
		{
			mid=mid.next;
			count++;
		}
		return mid;
	}
	public static void insertAtMid(Node head)
	{
		Node temp = new Node(16);
		Node mid = midNode(head);
		temp.next=mid.next;
		mid.next=temp;
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
		list.head.next.next.next.next = new Node(10);
		list.head.next.next.next.next.next= new Node(20);
		int pos = 2;
		list.insertAfter(head.next);
		list.insertAtMid(head);
		list.printlist(head);
		Node m = list.midNode(head);
		System.out.println("Mid node is"+m.data);
	}
}
		