class TwoStacks
{
	static int arr[];
	static int top1,top2;
	static int size;
	
	TwoStacks(int n)
	{
		arr = new int[n];
        size = n;
        top1 = -1;
        top2 = n;
    }
	static void push1(int x)
	{
		if(top1 == top2 -1)
		{
			System.out.println("Stackoverflow");
		}
		else
		{
			top1++;
			arr[top1] = x;
		}
	}
	static void push2(int x)
	{
		if(top1 == top2 -1)
		{
			System.out.println("Stackoverflow");
		}
		else
		{
			top2--;
			arr[top2] = x;
		}
	}
	static int pop1()
	{
		if(top1 == -1)
		{
			System.out.println("Stackunderflow");
		}
		else
		{
			int x = arr[top1];
			top1--;
			return x;
		}
		return (0);
	}
	static int pop2()
	{
		if(top2 == size)
		{
			System.out.println("Stackunderflow");
		}
		else
		{
			int x = arr[top2];
			top2++;
			return x;
		}
		return (0);
	}
	public static void main(String args[])
	{
		TwoStacks stack = new TwoStacks(7);
		stack.push1(1);
		stack.push1(7);
		stack.push1(8);
		stack.push1(2);
		stack.push1(3);
		stack.push2(4);
		stack.push2(5);
		System.out.println(" The popped element from stack1 is" + stack.pop1());
		System.out.println(" The popped element from stack2 is " + stack.pop2());
	}
}
