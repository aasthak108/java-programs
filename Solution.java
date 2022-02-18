import java.util.Scanner;
class Solution
{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of test cases");
	int numberOfTest = sc.nextInt();
	System.out.println("Enter number of bags");
	int numberOfBags = sc.nextInt();
	System.out.println("Enter number of kids");
	int numberOfKids = sc.nextInt();
	int i=1;
	int candies=0;
	int candiesCount =0;
	for(i = 1;i<=numberOfBags;i++)
		{
			candiesCount = candiesCount+ i;
		}
		int remainingCandies= candiesCount % numberOfKids;	
	for(i = 1; i<=numberOfTest;i++)
	{
	    System.out.println("case #"+i+": "+remainingCandies);
	}
}
}
		