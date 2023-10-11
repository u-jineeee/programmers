package ll.level2.p76502;

import java.util.Stack;

public class Main {
}

class Solution {
	public int solution(String s) {
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			StringBuilder newString = new StringBuilder(s.substring(i));
			newString.append(s, 0, i);

			Stack<Character> stack = new Stack<>();
			for (int j = 0; j < s.length(); j++) {
				char c = newString.charAt(j);
				if (!stack.isEmpty() &&
					(c == ')' && stack.peek() == '(' ||
					c == ']' && stack.peek() == '[' ||
					c == '}' && stack.peek() == '{')) {
					stack.pop();
				} else {
					stack.add(c);
				}
			}
			if (stack.isEmpty()) answer++;
		}
		return answer;
	}
}
