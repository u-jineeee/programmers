package ll.level1.p134240;

public class Main {
}

class Solution {
	public String solution(int[] food) {
		StringBuilder answer = new StringBuilder();
		for (int i = 1; i < food.length; i++) {
			int x = food[i] / 2;
			answer.append(String.valueOf(i).repeat(Math.max(0, x)));
		}
		answer.append("0");
		int size = answer.length() - 2;
		for (int i = size; i >= 0; i--) {
			answer.append(answer.charAt(i));
		}
		return answer.toString();
	}
}
