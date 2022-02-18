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
class LinkedList2
{
	public static Node insertAtEnd(Node head,int x)
	{
		Node temp = new Node(x);
		if(head == null)
		{
			return temp;
		}
		Node current = head;
		while(current.next != null)
		{
			current = current.next;
		}
		current.next= temp;
		return head;
	}
	public static void main(String args[])
	{
		Node head = null;
		head = insertAtEnd(head,10);
		head = insertAtEnd(head,30);
		head = insertAtEnd(head,60);
		printlist(head);
	}
	public static void printlist(Node head)
	{
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data +"");
			current = current.next;
		}
	}
}
	
	
	
	
	
	
	