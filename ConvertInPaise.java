import java.util.Scanner;


class ConvertInPaise
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter price in rupees(p):");
		double p= sc.nextDouble();
		double paise =p*100;
		System.out.println("Price in paise = " +paise);
	}
}