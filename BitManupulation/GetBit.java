class GetBit
{
	public static void main(String args[])
	{
		int pos=1;
		int num =4;
		int bitMask =1<<pos;
		if((bitMask & num)==0)
		{
			System.out.println("Bit is 0");
		}
		else
		{
			System.out.println("Bit is 1");
		}
	}
}
