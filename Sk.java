package ds;

import java.util.Stack;

public class Sk {
	Stack<Integer> rev(Stack<Integer> s)
	{
		
		Stack<Integer>s2=new Stack<Integer>();
		s2.push(s.pop());
		if(!s.isEmpty())
		{
			
			rev(s);
		}
		
		return s2;
	}
public static void main(String[] args) 
{
	Stack<Integer> s=new Stack<Integer>();
	s.push(10);
	s.push(11);
	s.push(12);
	s.push(13);
	s.push(14);
	System.out.println(s);
	Sk r=new Sk();
	System.out.println(r.rev(s));
}
}
