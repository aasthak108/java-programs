import java.util.Scanner;
class NestedIf
{ 
  public static void main(String args[])
  { 
    int x,y;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of x");
	x = sc.nextInt();
	 {  if(x>1)
	 
		 if(x>0)
		 {
			y=1;
			System.out.println("y= " +y);
		}
	 }
	 {
		 if(x==0)
		 
		 {
			 y=0;
		    System.out.println("y="+y);
	 }
	 }
	   { 
	    if(x<0)
		
		{ 
		 y=-1;
		 System.out.println("y="+y);
		}
	   }
	   }
}
	  