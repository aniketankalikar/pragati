package scaler.assigments.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Advance_Stack1_Assignment {

	public static void main(String args[]) {
		String input = "))))))";
		int res = new Advance_Stack1_Assignment().solve(input);
		System.out.println(res);

	}

	public int solve(String A) {

		Set<String> closed = new HashSet<String>();
		closed.add("}");
		closed.add("]");
		closed.add(")");
		
		Set<String> pair = new HashSet<String>();
		pair.add("{}");
		pair.add("[]");
		pair.add("()");

		String[] strArray = new String[A.length()];

		for (int i = 0; i < A.length(); i++) {
			char val = A.charAt(i);
			strArray[i] = String.valueOf(val);
		}

		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < strArray.length; i++) {
			if (!closed.contains(strArray[i])) {
				stack.push(strArray[i]);
			} else if (closed.contains(strArray[i])) {
				if (stack.isEmpty())
					return 0;	
				else if (!stack.isEmpty() &&  !pair.contains(stack.pop()+strArray[i])  ) {
					return 0;
				}
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
