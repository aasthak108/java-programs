class Rectangle
{
  int length; // variable, property, class member
  int width;
  
  void setProperties(int x, int y)
  {
    length = x;
	width = y;
  }
  
  int getArea()
  {
    int area = length*width;
	return (area);
  }
}

class RectArea
{ 
  public static void main(String args[])
  {
   Rectangle rect1 = new Rectangle(); // Create Object
   rect1.length = 15;
   rect1.width = 10;
   int area1 = rect1.getArea();
   System.out.println("Area1 = " + area1);
   }
 }