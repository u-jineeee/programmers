package ll.level1.p82612;

public class Main {
}

class Solution {
	public long solution(int price, int money, int count) {
		long answer = count * (2L *price + (long)(count - 1) * price) / 2 - money;
		if (answer < 0)
			return 0;
		return answer;
	}
}