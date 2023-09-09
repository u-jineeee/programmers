package ll.level1.p12943;

public class Main {
}

class Solution {
	public int solution(int num) {
		if (num == 1)
			return 0;

		int cnt = 0;
		long x = num;
		while (x != 1) {
			if (cnt >= 500)
				return -1;

			if (x % 2 == 0)
				x /= 2;
			else
				x = x*3 + 1;

			cnt++;
		}
		return cnt;
	}
}
