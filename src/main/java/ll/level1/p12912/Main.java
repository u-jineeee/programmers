package ll.level1.p12912;

public class Main {
}

class Solution {
	public long solution(int a, int b) {
		if (b > a)
			return ((long)b * (b + 1) / 2) - ((long)a * (a + 1) / 2) + a;
		return ((long)a * (a + 1) / 2) - ((long)b * (b + 1) / 2) + b;
	}
}
