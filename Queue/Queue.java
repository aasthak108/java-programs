import java.util.*;
import java.io.*;
import java.lang.*;
class Queue
{
	static int queue[];
	static int size;
	static int front;
	static int rear;
	
	Queue(int size)
	{
		this.front=0;
		this.rear=-1;
		this.queue = new int[this.size];
	}
	static void enqueue(int item)
	{
		if(this.rear == this.size)
		{
			System.out.println("Queue is full");
		}
		else
		{
			this.queue[this.rear] = item;
			this.rear = (this.rear+1);
		}
	}	
	static void dequeue()
	{
		int element;
		if(this.front==0 && this.rear==0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			element = this.queue[this.front];
			this.front=(this.front+1);
		}
	}
	 static void display()
	{
		int i;
		if(this.front==0 && this.rear==0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(i=this.front;i<this.rear;i++)
		{
			System.out.println("Queue is" + this.queue[i]);
		}
		}
	}
	static void peek()
	{
		if(this.front==0 && this.rear==0)
		{
			System.out.println("No peek element");
		}
		else
		{
			System.out.println("Peek element is"+ this.queue[this.front]);
		}
	}
	
		public static void main(String args[])
	{
		Queue q = new Queue(4);
		this.q.enqueue(1);
		this.q.enqueue(2);
		this.q.enqueue(3);
		this.q.enqueue(4);
	}		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			