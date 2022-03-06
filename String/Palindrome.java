class Palindrome
{
	public int checkPalindrome(char str, int e, int s)
	{
			if((strcharAt(s)) != (strcharAt(e)))
			return -1;
			if((strcharAt(s)) == (strcharAt(e)))
			return 1;
			if(s<e)
			return checkPalindrome(str,s+1,e-1);
			return 1;
	}
	public static void main(String args[])
	{
		char str = "aabaa";
		int e = str.length;
		int s = 0;
		int result = new Palindrome().checkPalindrome(str,e,s);
		System.out.println(result + " ");
	}
}
		
		
		