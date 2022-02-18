import java.lang.Math;
class Management
{ 
  public static void main(String args[])
  {
	int d= 1; int s= 1; int h=2;
	double x;
	x= Math.sqrt((2*d*s)/h);
	System.out.println("Economic order quantity EOQ is " + x);
	double y;
	y= Math.sqrt((2*s)/(d*h));
	System.out.println("Time between orders TBO is " + y);
	}
}
   