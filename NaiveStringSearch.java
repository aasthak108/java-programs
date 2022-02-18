class NaiveStringSearch
{
	public static int naiveStringSearching(String text, String pattern, int m,int n)
	{
		int i;
		for( i=0; i<m-n;i++)
		{
			for(int j=0; j<=n;j++)
			{
				if(pattern.charAt(j) != text.charAt(i))
				{
					break;
				}
				if(j==n)
				System.out.println("" +i);
			}
		}
		return i;
	}
	public static void main(String args[])
	{
		String text = "AAABBCABCD";
		String pattern = "ABCD";
		int m = text.length();
		int n = pattern.length();
		System.out.println(naiveStringSearching(text,pattern,m,n));
	}
}
				
	
	