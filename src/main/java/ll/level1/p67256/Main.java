package ll.level1.p67256;

public class Main {
}

class Solution {
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int left_spot = 11;
		int right_spot = 11;

		for (int n : numbers) {
			if (n == 1 || n == 4 || n == 7) {
				left_spot = n;
				sb.append("L");
			}
			else if (n == 3 || n == 6 || n == 9) {
				right_spot = n;
				sb.append("R");
			}
			else {
				int left_dist = middle(left_spot, n);
				int right_dist = middle(right_spot, n);

				if (left_dist == right_dist) {
					if (hand.equals("left")) {
						left_spot = n;
						sb.append("L");
					}
					else {
						right_spot = n;
						sb.append("R");
					}
				}
				else if (left_dist < right_dist) {
					left_spot = n;
					sb.append("L");
				}
				else {
					right_spot = n;
					sb.append("R");
				}
			}
		}

		return sb.toString();
	}
	public int middle(int start, int end) {
		int[][] n = {{1,2,3,4}, {2,1,2,3}, {3,2,1,2}, {4,3,2,1}};

		if (end == 0) end = 11;

		if (start == 0)
			return n[3][end/3]-1;
		else if (start == 2 || start == 5 || start == 8)
			return n[start/3][end/3]-1;
		else if (start == 3 || start == 6 || start == 9)
			return n[(start-1)/3][end/3];

		return n[start/3][end/3];
	}
}
