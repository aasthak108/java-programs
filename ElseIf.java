import java.util.Scanner;
class ElseIf
{
 public static void main(String args[])
 {  
    int y;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of x");
	int x= sc.nextInt();
	{
	 if(x>0)
	 y=1;
	 else if(x==0)
	 y=0;
	 else
	 y=-1;
	}
	 System.out.println("y: = "+y);
	 
	}
}
   