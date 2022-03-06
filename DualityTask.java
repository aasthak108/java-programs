import java.util.Scanner;
import java.io.*;
class DualityTask
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int arrayLength = sc.nextInt();
		int array1[] = new int[arrayLength];
		for(int k=0;k<=testCase;k++)
		{
			for(int i=0;i<arrayLength;i++)
			{
				array1[i] = sc.nextInt();
			}
		}
		for(int i=0;i<arrayLength;i++)
		{
			System.out.println(""+array1[i]);
		}
	}
}