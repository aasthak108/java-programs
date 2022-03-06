import java.util.Scanner;
import java.io.*;
class Pizzeria
{
	public static void main(String args[])
	{
		// Pizza Selection Program
		int count = 0;
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of potential clients");
		int clientNumber = sc.nextInt();
		String[] mainLikeArray = new String[20];
		for(int j=0;j<=clientNumber*2;j++)
		{
			System.out.println("Enter Like ingridients");
			String ingridients = sc.nextLine();
			String[] likeArray = ingridients.split("\\s+");
			System.out.println("Liked Ingridients are");
			for(i=count;i<likeArray.length;i++)
			{
				System.out.print(" " +likeArray[i]);
				mainLikeArray[count] = likeArray[i];
				count++;
			}
		}
		System.out.println("Main array is" +mainLikeArray);		
		
}