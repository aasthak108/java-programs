import java.util.Scanner;
class Discount
{
  public static void main(String args[])
  { 
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter total cost (tc)");
	double tc = sc.nextFloat();
	System.out.println("Enter M for MILL CLOTHES or H for HANDLOOM ITEMS");
	char ch= sc.next().charAt(0);
	double pp = 0.0;
	{
      switch(ch)
	  {
		  case 'M':
		  { 
		    if(tc>=1&&tc<=100)
			pp = tc;
			if(tc>=101&&tc<=200)
			pp = (tc-(double)5/100*tc);
			if(tc>=201&&tc<=300)
			pp = (tc-(double)7.5/100*tc);
			if(tc>300)
			pp = (tc-(double)10/100*tc);
			break;
		  }
		  case 'H':
		  { 
		    if(tc>=1&&tc<=100)
			pp = (tc-(double)(5/100)*tc);
			if(tc>=101&&tc<=200)
			pp = (tc-(double)7.5/100*tc);
			if(tc>=201&&tc<=300)
			pp = (tc-(double)10/100*tc);
			if(tc>300)
			pp = (tc-(double)15/100*tc);
			break;
		  }
	  }
	  System.out.println("The amount to be paid is " +pp);
	}
  }
}
			