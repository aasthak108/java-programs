import java.util.Stack;
class InfixTOPostfix
{
	public static void main(String args[]) 
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        
        System.out.println(infixToPostfix(exp));
    }

	 static int priority(char ch)
    {
        if(ch=='+' || ch=='-')
		{
			return 1;
		}
		if(ch == '*' || ch == '/')
		{
			return 2;
		}
		if(ch == '^' || ch == '$')
		{
			return 3;
		}
        
        return -1;
	}
	public static String infixToPostfix(String exp)
	{
		String result = new String("");
		Stack<Character> stack = new Stack<>();
		int i;
		for(i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result += c;
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')'){
                char x = stack.pop();
                while(x!='(')
				{
                    result += x;
                    x = stack.pop();
                }
            }else if(c=='(')
			{
                stack.push(c);
            }
			else
			{
				
                while (!stack.isEmpty() && priority(c) <= priority(stack.peek()))
                    result += stack.pop();
					stack.push(c);
			}
		}
			while (!stack.isEmpty())
			{
				result += stack.pop();
			}
			return result;	
	}
}
		
	
			
			
			
			
			
			
			
			
			
			
			
	