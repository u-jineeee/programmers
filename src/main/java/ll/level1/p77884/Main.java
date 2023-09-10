package ll.level1.p77884;

public class Main {
}

class Solution {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int x = numberOfDivisor(i);
			if (x % 2 == 0)
				answer += i;
			else
				answer -= i;
		}
		return answer;
	}

	public int numberOfDivisor(int n) {
		int cnt = 1;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0)
				cnt++;
		}
		return cnt;
	}
}