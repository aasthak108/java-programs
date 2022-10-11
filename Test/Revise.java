import java.util.*;
import java.io.*;
import java.lang.*;
class Revise
{
	int arr[];
	int f;
	int r;
	int size;
	Revise(int s)
	{
		size = s;
		arr = new int[size];
		f=0;
		r=0;
	}
	void enque(int x)
	{
		if(r == size)
		{
			System.out.println("Queue is full");
		}
		arr[r] = x;
		r = r+1;
	}
	int deque()
	{
		if(f==0 && r==0)
		{
			System.out.println("Queue is empty");
		}
		int element = arr[f];
		f = f+1;
		return element;
	}
	void display()
	{
		if(f==0 && r==0)
		{
			System.out.println("Queue is empty");
		}
		for(int i =f;i<r;i++)
		{
			System.out.println(" " + arr[i]);
		}
	}
	public static void main(String args[])
	{
		Revise q = new Revise();
		q.enque(1);
		q.enque(4);
		q.enque(6);
		q.enque(9);
		System.out.println("Dequeued element is " + q.deque());
		q.display();
	}
}
	