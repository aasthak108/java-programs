class PrintToN
{
	static void printNumbers(int n)
	{
		if(n<1)
		{
			return;
		}
		printNumbers(n-1);
		System.out.println(""+n);
	}
	public static void main(String args[])
	{
		int n=10;
		printNumbers(n);
	
	}
}