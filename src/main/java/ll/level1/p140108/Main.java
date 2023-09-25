package ll.level1.p140108;

public class Main {
}

class Solution {
	public int solution(String s) {
		int answer = 0;
		int x_cnt = 1;
		int other_cnt = 0;
		char c = s.charAt(0);
		int i;
		for (i = 1; i < s.length(); i++) {
			if (c == s.charAt(i)) x_cnt++;
			else other_cnt++;

			if (x_cnt == other_cnt) {
				x_cnt = 0;
				other_cnt = 0;
				answer++;
				if (i != s.length()-1)
					c = s.charAt(i+1);
			}
		}
		if (x_cnt != 0)
			answer++;
		return answer;
	}
}
