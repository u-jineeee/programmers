package ll.level2.q12985;

public class Main {
}

class Solution {
	public int solution(int n, int a, int b) {
		int answer = 1;
		int left;
		int right;

		if (a > b) {
			right = a;
			left = b;
		} else {
			right = b;
			left = a;
		}

		while (n > 1) {
			n /= 2;
			if (left % 2 == 1 && right - left == 1) break;
			left = (left + 1) / 2;
			right = (right + 1) / 2;
			answer++;
		}
		return answer;
	}
}
