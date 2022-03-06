class PalindromeCheck
{
	public int stringPalindromeCheck(String str,int i,int j)
	{
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return -1;
			}
			i++;
			j--;
		}
		return 1;
	}
	public static void main(String args[])
	{
		String str = "aabaa";
		int i = 0;
		int j = str.length()-1;
		int Palindrome_Or_Not= new PalindromeCheck().stringPalindromeCheck(str,i,j);
		if(Palindrome_Or_Not ==1)
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
}