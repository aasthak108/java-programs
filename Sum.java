import java.util.Scanner;
class Sum
{ 
 public static void main(String args[])
 {
  int sum;
  sum = 0;
  String s1 = ("24");
  Scanner sc= new Scanner(System.in);
  char ch1 =sc.next().charAt(0);
  char ch2 =sc.next().charAt(1);
  sum = s1.charAt(0)+s1.charAt(1);
  System.out.println(" Sum of Given Integer 24 = " +sum);
  }
}