package ll.level1.p12931;

public class Main {
}

class Solution {
	public int solution(int n) {
		int answer = 0;

		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			answer += r;
		}
		return answer;
	}
}
