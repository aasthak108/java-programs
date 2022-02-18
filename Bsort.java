class Bsort
{
 public int[] sort(int a[])
 {
  int i,j;
  int n=5;
  for(i=0;i<4;i++)
   {
    for(j=0;j<4;j++)
	 { 
	  if(a[j]>a[j+1])
	   {
	    int temp=a[j+1];
		a[j]=a[j+1];
		a[j+1]= temp;
	   }
	 }
   }  
    return a;
  }
public static void main(String args[])
 {
  int a[]={25,26,16,18,14};
  int array[] = new Bsort().sort(a);
  for(int j=0;j<5;j++)
  {	  
    System.out.println("The sorted array is a[j]: " + array[j]);
  }
 }
}
  