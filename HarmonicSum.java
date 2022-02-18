class HarmonicSum
{
  public static void main(String args[])
  {
	  double sum = 1;
	  int n = 6;
	  for (int i = 2; i < 7; i++)
	  {
		 double temp = 1.00/i;
		 sum = temp + sum;
	  }
	  System.out.println("Sum : "+sum);
  }
}