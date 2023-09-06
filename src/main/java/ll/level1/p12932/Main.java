package ll.level1.p12932;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public int[] solution(long n) {
		List<Integer> list = new ArrayList<>();
		int r;
		while (n > 0) {
			r = (int)(n%10);
			n = n/10;
			list.add(r);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
