package ll.level2.p17687;

public class Main {
}

class Solution {
	public String solution(int n, int t, int m, int p) {
		StringBuilder answer = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		int cnt = 2;
		sb.append("01");
		for (int i = 2; i <= t * m;) {
			int x = cnt++;
			StringBuilder s = new StringBuilder();
			while (x > 0) {
				int y = x % n;
				if (y >= 10 && y <= 15) {
					s.append((char)('A' + y - 10));
				} else {
					s.append(y);
				}
				x /= n;
			}
			sb.append(s.reverse());
			i += s.length();
		}

		for (int i = 0; i < t * m; i += m) {
			answer.append(sb.toString().charAt(i+p-1));
		}

		return answer.toString();
	}
}

