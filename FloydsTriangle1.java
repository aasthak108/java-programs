class FloydsTriangle1
{ 
  public static void main(String args[])
  {  int r,c;
	 int number = 1;
	 for(r=1;r<=100;r++)
	 {  
	   for(c=1;c<=r;c++)
	   {
		   System.out.print(number+" ");
			number++;
			if(number > 99)
		   {
			   break;
		   }
	   }
	   if(number > 99)
		   {
			   break;
		   }
	   System.out.println("");
	   }
	}
}