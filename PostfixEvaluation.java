import java.util.Stack;
class PostfixEvaluation
{
	public static void main(String args[])
	{
		
        String exp = "10 5 +60 6/ *8-";
        System.out.println("postfix evaluation: "+postfixEvaluation(exp));
    }
	static int postfixEvaluation(String exp)
	{
		Stack<Integer> stack = new Stack();
		int i;
		for(i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			if(Character.isDigit(c))
			{
				stack.push(c - '0');
			}
			else
			{
				int op1 = stack.pop();
				int op2 = stack.pop();
				if(c == '+')
				{
					return stack.push(op2 + op1);
				}
				if(c == '-')
				{
					return stack.push(op2 - op1);
				}
				if(c == '*')
				{
					return stack.push(op2 * op1);
				}
				if(c == '/')
				{
					return stack.push(op2/op1);
				}
				if(c == '^')
				{
					return stack.push(op2 ^ op1);
				}
				
			}
		}
		return stack.pop();
	}
}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	