class SecondLargest
{
 public int large(int a[])
 {
  int max=a[0];
  int secondlargest=a[0];
  for(int i=1;i<a.length;i++)
     {
         if(max<a[i])
         {
            max=a[i];
		 }
	     if(secondlargest<a[i] && max>a[i])
	     {
	       secondlargest=a[i];
		   
	     }
     } 
   	 return secondlargest;
  }
 public static void main(String args[])
  {
   int largest;
   int array[]={9,1,10,5,7};
   largest=new SecondLargest().large(array);
   System.out.println("The second largest element is: " + largest);
  }
}
	
	