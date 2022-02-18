import java.util.Scanner;
class LinearEquation
{ 
  public static void main(String args[])
  {
    double x1,x2;
	float a,b,c,d,m,n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of a ");
	a= sc.nextInt();
	System.out.println("Enter the value of b ");
	b= sc.nextInt();
	System.out.println("Enter the value of c ");
	c= sc.nextInt();
	System.out.println("Enter the value of d ");
	d= sc.nextInt();
	System.out.println("Enter the value of m ");
	m= sc.nextInt();
	System.out.println("Enter the value of n ");
	n= sc.nextInt()
    x1 = (m*d-b*n)/(a*d-c*d);
	x2 = (n*a-m*c)/(a*d-c*d);
	{
	 if(a*d-c*d == 0)
	 { System.out.println("Value Not Defined");
	 }
	 else
	System.out.println("Value of x1 = " + x1 + " and x2 = " + x2);
	}
		
  }
}
	
	
	 
	