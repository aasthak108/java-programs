public class SwapNumbers1
{
    public static void main (String args[])
	{
	   int x = 5, y = 3;
	   System.out.println("Before swap");
	   System.out.println("x = " + x);
	   System.out.println("y = " + y);
		x = x+y;
		y = x-y;
		x = x-y;
	    System.out.println("After swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}