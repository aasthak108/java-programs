class Triangle2
{ 
 public static void main(String args[])
 { 
   int r,c,sc;
   for(r=1;r<=5;r++){
   System.out.println("");
   
	for(sc=1;sc<=r-1;sc++)
	{
	 System.out.print(" ");
	}
	for(c=sc;c<=5;c++){
	System.out.print("$");
	}
   }
 }
}