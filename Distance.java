import java.util.Scanner;
class Distance
{ 
   public static void main(String args[])
   {  
      int u= 2; int a= 4;
      Scanner sc= new Scanner(System.in);
	  System.out.println("Enter time interval (t)");
	  int t= sc.nextInt();
	  int Distance_travelled = u*t+(a*t*t)/2;
	  System.out.println("Distance travelled = " + Distance_travelled);  
   }
}
	  