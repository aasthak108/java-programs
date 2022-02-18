class Queue
{
	int queue[];
	int size=4;
	int front;
	int rear;
	Queue(int size)
	{
		front=rear=0;
		queue = new int[size];
	}
	void enqueue(int item)
	{
		if(rear == size)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queue[rear] = item;
			rear++;
		}
	}			
	void dequeue()
	{
		int element;
		if(front==0 && rear==0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			element = queue[front];
			front++;	
		}
	}
	 void display()
	{
		int i;
		if(front==0 && rear==0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(i=front;i<rear;i++)
		{
			System.out.println("Queue is" + queue[i]);
		}
		}
	}
	 void peek()
	{
		if(front==0 && rear==0)
		{
			System.out.println("No peek element");
		}
		else
		{
			System.out.println("Peek element is"+ queue[front]);
		}
	}
	public static void main(String args[])
	{
		Queue q = new Queue(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			