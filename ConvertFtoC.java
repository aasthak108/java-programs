import java.util.Scanner;
class ConvertFtoC
{
    public static void main(String[] args)
	{
		double temperatureInF,temperatureInC;
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter temperature in Fahrenheit");
	  temperatureInF = sc.nextDouble();
	  temperatureInC = (temperatureInF-32)/1.8;
	  System.out.println("temperature in Celcius = " + temperatureInC);
	}
}