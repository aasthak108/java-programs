import java.util.Scanner;
class Pizzeria
{
	public static void main(String args[])
	{
		// Pizza Selection Program
		int i=0;
		int j;
		String[] arrayL = new String[5];
		System.out.println("Enter Like ingridients");
		Scanner s = new Scanner(System.in);
		arrayL[i] = s.nextLine();
		//System.out.println(arrayL[i]);
		System.out.println("Enter Like ingridients");
		Scanner s1 = new Scanner(System.in);
		for(j=arrayL.length;j<arrayL.length+2;j++)
		{
		arrayL[j] = s1.nextLine();
		System.out.println(arrayL[j]);
		}
	}
		
}