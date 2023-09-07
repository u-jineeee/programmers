package ll.level1.p12934;

public class Main {
}

class Solution {
	public long solution(long n) {
		double s = Math.sqrt(n);
		return (n % s == 0) ? (long)((s + 1) * (s + 1)) : -1;
	}
}
