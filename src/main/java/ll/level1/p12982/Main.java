package ll.level1.p12982;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if (budget < d[i])
				break;
			budget -= d[i];
			answer++;
		}
		return answer;
	}
}