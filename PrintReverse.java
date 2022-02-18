import java.io.*;
import java.util.*;
import java.util.Stack;
class PrintReverse
{
	static int printReverse(LinkedList List)
	{
		Stack<Integer> s = new Stack();
		Node head;
		Node curr;
		head = curr;
		while(curr != null)
		{
			s.push(curr);
			curr = curr.next;
		}
		while(!s.isEmpty())
		{
			Node = s.top();
			System.out.println("Reversed list is"+pop(Node.data));
			Node = s.pop();
		}
	}
	public static void main(String args[])
	{
		LinkedList List = new LinkedList();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	