import java.util.Scanner;
class FloydsTriangle
{ 
  public static void main(String args[])
  {  int r,c,n;
	 int number = 1;
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the value of row for Floyd's Triangle (n)");
	 n = sc.nextInt();
	  for(r=1;r<=n;r++)
	 {  
	   for(c=1;c<=r;c++)
	   {
		   System.out.print(number+" ");
		   number++;
	   }
	   System.out.println("");
	   }
	}
}