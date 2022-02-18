class MthHalf
{
public static int mthHalf(int N,int M)
{
	while(M-1>0)
	{
		N=N/2;
		M--;
	}
		return N;
		
}
public static void main(String args[])
{
	int N=10;
	int M=3;
	System.out.println(mthHalf(N,M));
}
}