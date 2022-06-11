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
public class LinkedList
{
	Node head;
	Node tail;
	public LinkedList()
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
	LinkedList givenLinkedList = new LinkedList();
	givenLinkedList.add(1);
	givenLinkedList.add(2);
	givenLinkedList.add(3);
	givenLinkedList.add(4);
	givenLinkedList.add(5);
	givenLinkedList.add(6);
	givenLinkedList.add(7);
	givenLinkedList.add(9);
	givenLinkedList.add(10);
	int length = getCount(givenLinkedList);
	System.out.println("The length is " +length);
	Node head = givenLinkedList.head;
	Node middleNode = getMiddleNode(givenLinkedList);
	System.out.println(" Middle node ="+ middleNode.data);
	LinkedList updatedLinkedList = deleteFirstNode(givenLinkedList);
	printlist(updatedLinkedList.head);
	searchInLinkedList(givenLinkedList); 	
}
	public static int getCount(LinkedList givenLinkedList)
	{
		Node current = givenLinkedList.head;
		int count = 0;
		while( current != null)
		{
			current = current.next;
			count++;
		}
		return count;
	}
public static Node getMiddleNode(LinkedList givenLinkedList)
{
	
	
	int midLength;
	Node midNode = givenLinkedList.head;
	int length = getCount(givenLinkedList);
	int count =1;
	if(length%2==0)
	{
		midLength = length/2;
	}
	else
	{
		midLength = (length/2)+1;
	}
	System.out.println(" The middle length is =" + midLength);
	while(count<midLength)
	{
			midNode = midNode.next;
			count++;
	}
	return midNode;
}
public static LinkedList insertAtMiddle(LinkedList givenLinkedList)
{
	Node Middlenode = getMiddleNode(givenLinkedList);
	Node newNode = new Node();
	newNode.data = 8;
	Node temp = Middlenode.next;
	Middlenode.next = newNode;
	newNode.next = temp;
	return givenLinkedList;
}
	public static LinkedList deleteFirstNode(LinkedList givenLinkedList)
	{
		Node temp = givenLinkedList.head;
		givenLinkedList.head= temp.next;
		return givenLinkedList;
	}	
public static void printlist(Node head)
{
	
	Node curr = head;
	while(curr!=null)
	{
		System.out.println(curr.data +"");
		curr = curr.next;
	}
}
public static LinkedList searchInLinkedList(LinkedList givenLinkedList)
{
	Node curr = givenLinkedList.head;
	while(curr!=null)
	{
		if(curr.data == 2)
		{
			System.out.println("Element present in LinkedList");
		}
		else
		{
		  System.out.println("Element not present in LinkedList");
		}
		curr= curr.next;
	}    
	return givenLinkedList;
}			
}
