import java.util.Scanner;
class Solution
{
	public static int ks1(int N, int M)
	{
		int candies = 0;
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter No. bags ");  
		// int N = sc.nextInt();
		// System.out.print("Enter No. kids: "); 
		// int M = sc.nextInt();
		int kids =M;
		
		for(int i = 1;i<=N;i++)
		{
			candies = candies+ i;
		}
		int remainingCandies= candies % M;
		return remainingCandies;
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of test cases");
	int numberOfTest = sc.nextInt();
	int numberOfBags = sc.nextInt();
	int numberOfKids = sc.nextInt();
	for(int i = 1; i<=numberOfTest;i++)
	{
	    int remainingCandies = ks1(numberOfBags, numberOfKids);
	    System.out.println("case #"+i+": "+remainingCandies);
	}
}
}
		