import java.util.Scanner;
class Operator
{ 
 public static void main(String args[])
 { 
  int y,x;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the value of x");
  x = sc.nextInt();
  {
	  if(x==0)
		y=0;
		else
		y = (x>0) ? 1 : -1;
  }
		System.out.println("y = "+y);
		}
}
	