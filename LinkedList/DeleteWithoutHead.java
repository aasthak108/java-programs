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
class DeleteWithoutHead
{
   static Node head;
  public void deleteWitoutHead(Node node)
  {
    Node temp = node.next;
	if(node==null)
	{
		return;
	}
	else if(node.next==null)
	{
		return;
	}
	else{
			node.data=temp.data;
			node.next = temp.next;
		}
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
		DeleteWithoutHead list = new DeleteWithoutHead();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.deleteWitoutHead(head);
		list.printlist(head);
	}
}
		