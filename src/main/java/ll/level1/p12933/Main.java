package ll.level1.p12933;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
}

class Solution {
	public long solution(long n) {
		List<Long> list = new ArrayList<>();
		while (n > 0) {
			long r = n % 10;
			n = n / 10;
			list.add(r);
		}

		list.sort(Comparator.reverseOrder());
		long answer = 0;
		for (long x : list) {
			answer = answer*10 + x;
		}
		return answer;
	}
}
