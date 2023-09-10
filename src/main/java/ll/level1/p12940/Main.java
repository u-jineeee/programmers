package ll.level1.p12940;

public class Main {
}

class Solution {
	public int[] solution(int n, int m) {
		int gcd = gcd(n, m);
		return new int[] {gcd, n * m / gcd};
	}

	public int gcd(int x, int y) {
		int max = 1;
		for (int i = 2; i < (Math.max(x, y)); i++) {
			if (x%i == 0 && y%i == 0)
				max = i;
		}
		return max;
	}
}