class NaiveStringSearch
{
    static boolean naiveStringSearch(String pattern, String text)
    {
        int M = pattern.length(); 
        int N = text.length(); 
        for (int i = 0; i <= N - M; i++) 
        { 
	        int j; 
	        for (j = 0; j < M; j++) 
			{
				
		        if (text.charAt(i + j) != pattern.charAt(j)) 
				{
					break;
				}
			}
	        if (j == M) 
		        return true;
				i = i + M;
            }
	    return false;
    }
    public static void main(String args[])
	{
		String text = "AAAABDCCCA";
		String pattern = "CCCA";
		naiveStringSearch(pattern,text);
	}
}
