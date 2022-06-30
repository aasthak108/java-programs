class Palindrome
{
	public int checkPalindrome(String str, int e, int s)
	{
			if((str.charAt(s)) != (str.charAt(e)))
			return -1;
			if((str.charAt(s)) == (str.charAt(e)))
			return 1;
			if(s<e)
			return checkPalindrome(str,s+1,e-1);
			return 1;
	}
	public static void main(String args[])
	{
		String str = "aabaa";
		int e = str.length()-1;
		int s = 0;
		int result = new Palindrome().checkPalindrome(str,e,s);
		
		System.out.println(result + " ");
	}
}
		
		
		