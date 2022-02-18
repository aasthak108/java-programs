class MaxiMizeMoney 
{
public static void main(String args[])
{
	int N=2;
	int K=10;
	System.out.println(maximizeMoney(N,K));
}
public static int maximizeMoney(int N , int K) 
	{
		int money;
		if(N%2==0)
		{
			money= (N/2)*K;
		}
		else
		{
			money = ((N/2)+1)*K;
		}
		return money;
	}
}