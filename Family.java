import java.util.Scanner;
import java.io.*;
import java.util.*;
class Family
{
	public static void main(String args[])
	{   int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter family name");
		String inputString = sc.nextLine();
		System.out.println("String length is" + inputString.length());
		String[] array = inputString.split("\\s+");
		System.out.println("length of array "+array.length);
		for(i=0;i<array.length;i++)
		System.out.print(" "+array[i]);
	}
} 