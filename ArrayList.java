import java.util.*;
class ArrayList
{
	public static void main(String args[])
	{
		int n=10;
		ArrayList arrli = new ArrayLists(n);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of potential clients");
		int clientNumber = sc.nextInt();
		for(int i=0;i<=clientNumber;i++)
		{
			System.out.println("Enter Like ingridients");
			String ingredients = sc.nextLine();
			arrli.add("ingredients") = ingredients.split("\\s+");
			System.out.println(arrli(i));
		}
	}
}
		