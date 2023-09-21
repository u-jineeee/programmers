package ll.level1.p161989;

public class Main {
}

class Solution {
	public int solution(int n, int m, int[] section) {
		int answer = 0;

		if (m == n)
			return 1;
		else if (n == section.length)
			return n;

		for (int i = 0; i < section.length; i++) {
			if (i == section.length-1) {
				answer++;
				break;
			}
			int b = section[i] + m - 1;
			for (int j = i+1; j < section.length; j++) {
				if (section[j] > b)
					break;
				i++;
			}
			answer++;
		}
		return answer;
	}
}
