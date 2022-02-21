import java.util.Scanner;
import java.io.*;
class Pizzeria
{
	public static void main(String args[])
	{
		// Pizza Selection Program
		int i=0;
		int j;
		String[] array = new String[10];
		System.out.println("Enter Like ingridients");
		Scanner s = new Scanner(System.in);
		array[i] = s.nextLine();
		for(String likeArray : array.split(" "));	
		System.out.println(likeArray);
	}
		
}