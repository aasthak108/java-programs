class AnagramCheck
{
	public int anagramTest(String str1,String str2)
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<str1.length();i++)
		{
			sum1= sum1+(int)str1.charAt(i);
		}
		for(int j=0;j<str2.length();j++)
		{
			sum2= sum2+(int)str2.charAt(j);
		}
		if(sum1 == sum2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static void main(String args[])
	{
		String str1= "aba";
		String str2= "baa";
		int CheckingForAnagram = new AnagramCheck().anagramTest(str1,str2);
		if(CheckingForAnagram==1)
		{
			System.out.println("The given two strings are an Anagram");
		}
		else
		{
			System.out.println("The given two strings are not an Anagram");
		}
	}
}
			
			
			
			
			
			
			
		