import java.util.Scanner;
import java.lang.Math;
class Frequency
{
  public static void main(String args[])
  {  
     
	 double r,l;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the value of inductance (l)");
	 l= sc.nextDouble();
	 System.out.println("Enter the value of resistance (r)");
	 r= sc.nextDouble();
	 for(double c = 0.01; c <= 0.10; c=c+0.01)
	 { 
		double f = Math.sqrt((1.00/(l*c))-(r*r/(4.00*c*c)));
		System.out.println("For C = "+c+" Frequency is "+f);
		}
    }
}	
	    