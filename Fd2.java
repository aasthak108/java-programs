import java.util.Scanner;
class Fd2
{  
  public static void main(String args[])
   { 
     int n,r,c;
	 int nextNumber;
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the number of rows for Floyd's Triangle (n)");
	 n= sc.nextInt();
	 for(r=1;r<=n;r++)
	 {
		 nextNumber = 0;
		 if(r%2==1)
		 { 
			nextNumber = 1;
		 }
		for(c=1;c<=r;c++)
		{
	    System.out.print(nextNumber+" ");
		if(nextNumber == 0)
		nextNumber = 1;
		else
		nextNumber = 0;
		}  
	System.out.println(" ");	
	}
	
}
}