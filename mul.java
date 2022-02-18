class Multiply
{
	public static void main(String args[])
  {
	int product;
	int c=2;
	int d=3;
	product= new Multiply().multiply(2,3);
    System.out.println("The multiplication is : " + product);
  }
public int multiply(int a,int b)
 {
   int product= a*b;
   return product;
 }
}