class Factorial
{
  public static void main(String args[])
  {
	for(int i = 1; i<=10; i++)
	{
		// Factorial - Start
		int m, factorial;
		factorial = 1;
		for(m=i;m>=1;m--) 
		{
			factorial = factorial*m;
		}
		System.out.println("Factorial of "+i+" is "+factorial);
		// Factorial - End
	}
 }
}
	