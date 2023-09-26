package ll.level1.p64061;

import java.util.Stack;

public class Main {
}

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int n = board[j][moves[i]-1];
				if (n != 0) {
					if (!stack.empty() && stack.peek() == n) {
						stack.pop();
						answer+=2;
					}
					else {
						stack.push(n);
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}

		return answer;
	}
}
