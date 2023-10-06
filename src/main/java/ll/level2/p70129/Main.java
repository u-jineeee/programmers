package ll.level2.p70129;

public class Main {
}

class Solution {
	public int[] solution(String s) {
		int cnt = 0;
		int zero_sum = 0;

		while (!s.equals("1")) {
			int zero_cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					zero_cnt++;
					zero_sum++;
				}
			}
			cnt++;
			s = Integer.toBinaryString(s.length()-zero_cnt);
		}
		return new int[] {cnt, zero_sum};
	}
}
