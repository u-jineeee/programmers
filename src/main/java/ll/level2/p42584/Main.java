package ll.level2.p42584;

public class Main {
}

class Solution {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			int second = 0;
			for (int j = i+1; j < prices.length; j++) {
				if (prices[i] == 1) {
					second = prices.length - i - 1;
					break;
				} else if (prices[i] > prices[j]) {
					second++;
					break;
				}
				second++;
			}
			answer[i] = second;
		}
		return answer;
	}
}
