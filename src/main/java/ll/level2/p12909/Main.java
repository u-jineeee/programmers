package ll.level2.p12909;

import java.util.Stack;

public class Main {
}

class Solution {
	boolean solution(String s) {
		Stack<String> stack = new Stack<>();

		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') stack.push("(");
			else {
				if (!stack.isEmpty() && stack.peek().equals("(")) {
					stack.pop();
				}
				else {
					stack.push(")");
				}
			}
		}

		return stack.isEmpty();
	}
}
