import java.util.Scanner;
class RealNumber
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a real number(x)");
	int x = sc.nextInt();
	System.out.print(x-1+"	");
	System.out.print(x+"	");
	System.out.print(x+1+"	");
  }
}