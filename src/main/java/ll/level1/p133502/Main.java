package ll.level1.p133502;

import java.util.Stack;

public class Main {
}

class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		int hamburger = 1;
		Stack<Integer> stack = new Stack<>();

		for (int x : ingredient) {
			stack.push(x);
			if (hamburger == 4 && x == 1) {
				for (int j = 0; j < 4; j++) {
					stack.pop();
				}
				answer++;
				if (stack.size() >= 1 && stack.peek() == 1) {
					hamburger = 2;
				} else if (stack.size() >= 2 && stack.peek() == 2) {
					stack.pop();
					if (stack.peek() == 1)
						hamburger = 3;
					else
						hamburger = 1;
					stack.push(2);
				} else {
					hamburger = 1;
				}
			} else if (hamburger == x) {
				hamburger++;
			} else if (x == 1) {
				hamburger = 2;
			} else {
				hamburger = 1;
			}
		}
		return answer;
	}
}
