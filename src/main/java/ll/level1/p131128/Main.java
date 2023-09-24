package ll.level1.p131128;

public class Main {
}

class Solution {
	public String solution(String X, String Y) {
		int[] k = new int[10];
		int[] x = new int[10];
		int[] y = new int[10];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < X.length(); i++) {
			x[X.charAt(i) - '0']++;
		}
		for (int i = 0; i < Y.length(); i++) {
			y[Y.charAt(i) - '0']++;
		}
		for (int i = 0; i < 10; i++) {
			k[i] = Math.min(x[i], y[i]);
		}
		for (int i = 9; i >= 0; i--) {
			if (i == 0 && sb.isEmpty() && k[i] != 0)
				sb.append(0);
			else
				sb.append(String.valueOf(i).repeat(Math.max(0, k[i])));
		}

		if (sb.isEmpty())
			return "-1";

		return sb.toString();
	}
}
