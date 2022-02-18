class MyStack
{
	int arr[];
	int capacity;
	int top;
	MyStack(int c)
	{
	
		top = -1;
		capacity = c;
		arr = new int[capacity];
	}
	void push(int x)
	{
		if( top == capacity -1)
		{
			System.out.println("Stack is full");
		}
		top++;
		arr[top] = x;
	}
	int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		int result = arr[top];
		top--;
		return result;
	}
	int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
		}
		return arr[top];
	}
	int size()
	{
	return top+1;
	}
	boolean isEmpty()
	{
		return(top==-1);
	}
	public static void main(String args[])
	{
		MyStack s = new MyStack(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		for(int i=0;i<4;i++)
		{
			System.out.println(""+ s.pop());
		}
	}
	}


	
	
	
	
	
	
	
	
	
	
