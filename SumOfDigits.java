class SumOfDigits
{
	static  int sum(int n)
	{
		if(n<10)
		return n;
		else
		return n%10 + sum(n/10);
	}
    public static void main(String args[])
	
	{
		int n = 108;
		System.out.println(sum(n));
		
	}
}