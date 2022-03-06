import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Stack
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
	public static Node insertAtBegining(Node head,int x)
	{
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
public static void main(String args[])
{
	Node head = null;
	head = insertAtBegining(head,30);
	head = insertAtBegining(head,20);
	head = insertAtBegining(head,10);
	printlist(head);
}
public static void printlist(Node head)
{
	Node current = head;
	while(current !=null)
	{
		System.out.println(current.data+"");
		current = current.next;
	}	
}	
}