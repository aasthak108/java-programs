class CountDigits
{
	static int countDigits(int n)
	{
		int count =0;
		if(n>0)
		{
		count++;
		return count+countDigits(n/10);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String args[])
	{
		int n =11;
		int res = countDigits(n);
		System.out.println(""+ res);
	}
}