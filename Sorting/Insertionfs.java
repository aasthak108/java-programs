
class Insertion
{
public int[] insert(int a[],int b)
{
 int updatedArray[] = new int[8];
 // copy
 for(int i=0;i<a.length;i++)
 {
   updatedArray[i]=a[i];
 }
 
 
 int position=6;
 int i;
 for(i=6;i>=5;i--)
 {
   updatedArray[i+1]=a[i];
 }
 updatedArray[position]=7;
 return updatedArray;
}
public static void main(String args[])
 { 
   int b=7;
   int givenArray[]={1,2,3,4,5,6,8};
   int opArray[]=new Insertion().insert(givenArray);
  for(int i=0;i<opArray.length;i++)
  {
   System.out.println("Array is " + opArray[i]);
  }
 }
}