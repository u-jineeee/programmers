package ll.level2.p12911;

public class Main {
}

class Solution {
	public int solution(int n) {
		int one_size = Integer.bitCount(n);
		for (int i = n+1; ; i++) {
			if (one_size == Integer.bitCount(i))
				return i;
		}
	}
}
