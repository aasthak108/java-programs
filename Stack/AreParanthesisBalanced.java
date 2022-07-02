import java.util.Stack;
class AreParanthesisBalanced
{
	public static arePranthesisBalanced(String str)
	{
		int i;
		Stack <Character> s = new Stack<>();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '(' || str.charAt(i)== '[')
			{
				s.push(str.charAt(i));
			}
			char x=s.peek();
			if(str.charAt(i)== ')' && x=='(' || str.charAt(i) == ']' && x=='[')
			{	
				s.pop();
			}
		}
		if(s.empty())
		{
			return 1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		String str = "[()]";
		if(arePranthesisBalanced(str) ==1)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		