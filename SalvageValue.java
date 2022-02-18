import java.util.Scanner;
class SalvageValue
{
 public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter Purchase price (p)");
   double p = sc.nextDouble();
   System.out.println("Enter yers of service (y)");
   int y = sc.nextInt();
   System.out.println("Enter Annual depreciation (d)");
   double d = sc.nextDouble();
   double salvage_value = p-d*y;
   System.out.println("Salvage value"+salvage_value);
   }
}
   
    
  