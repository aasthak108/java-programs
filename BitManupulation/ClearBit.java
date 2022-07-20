class ClearBit
{
	public static void main(String args[])
	{
		int pos = 3;
		int num = 7;
		int bitMask = 1<<pos;
		int number = ~bitMask & num;
		System.out.println(""+ number);
	}
}