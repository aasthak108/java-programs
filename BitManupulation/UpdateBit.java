class UpdateBit
{
	public static void main(String args[])
	{
		int pos = 2;
		int num = 4;
		int bitMask = 1<<pos;
		int Update_to =0;
		if(Update_to == 0)
		{
			int number = ~bitMask & num;
			System.out.println(""+number);
		}
		else
		{
			int number = bitMask | num;
			System.out.println(""+number);
		}
	}
}
			