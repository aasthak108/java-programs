import java.util.Scanner;
class Application
{
  public static void main(String args[])
  { 
    int m,p,c,pcm,mp;
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter Maths marks(m)");
	m = sc.nextInt();
	System.out.println("Enter Physics marks(p)");
	p = sc.nextInt();
	System.out.println("Enter Chemistry marks (c)");
	c = sc.nextInt();
	System.out.println("Enter p+c+m marks (pcm)");
	pcm = sc.nextInt();
	System.out.println("Enter m+p marks (mp)");
	mp =sc.nextInt();
	{ 
	  if(m>=60)
		  if(p>=50)
			  if(c>=40)
				  if((p+c+m>=200)||(m+p>=150))
					System.out.println("Eligible");
				else
					System.out.println("Not Eligible");
			else
			  System.out.println("Not Eligible");
		else
		System.out.println("Not Eligible");
	else
		System.out.println("Not Eligible");
	  }
	 }
}
	
	