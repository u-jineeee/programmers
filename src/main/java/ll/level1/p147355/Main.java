package ll.level1.p147355;

public class Main {
}

class Solution {
	public int solution(String t, String p) {
		int answer = 0;
		int p_size = p.length();
		long p_number = Long.parseLong(p);

		for (int i = 0; i <= t.length() - p_size; i++) {
			long t_number = Long.parseLong(t.substring(i, i + p_size));
			if (t_number <= p_number)
				answer++;
		}
		return answer;
	}
}