class SetBit
{
	public static void main(String args[])
	{
		int pos = 1;
		int num = 5;
		int bitMask = 1<<pos;
		int number = bitMask | num;
		System.out.println(""+ number);
	}
}