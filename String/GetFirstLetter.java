class GetFirstLetter
{
	static String getFirstLetter(String str1)
	{
		int i;
		String str2 = "";
		String str3 = "";
		str2 = String.valueOf(str1.charAt(0));
		for(i=1;i<str1.length();i++)
		{
			if(str1.charAt(i)==' ')
			{
				str3 += str1.charAt(i+1);
			}
		}
		str3= str2 +str3;
		return str3;
	}
	public static void main(String args[])
	{
		String str1 = "Good Morning Hello";
		System.out.println("The required string is" + getFirstLetter(str1));
	}
}