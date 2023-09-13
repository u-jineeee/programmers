package ll.level1.p86491;

public class Main {
}

class Solution {
	public int solution(int[][] sizes) {
		int max = Math.max(sizes[0][0], sizes[0][1]);
		int min = Math.min(sizes[0][0], sizes[0][1]);

		for(int i = 1; i < sizes.length; i++) {
			int w = sizes[i][0];
			int h = sizes[i][1];
			if (max >= w && max >= h) {
				if (min < Math.min(w, h)) {
					min = Math.min(w, h);
				}
			}
			else if (max <= w && max >= h) {
				max = w;
				if (min < h)
					min = h;
			}
			else if (max > w) {
				max = h;
				if (min < w) {
					min = w;
				}
			}
			else if (max < w) {
				max = Math.max(w, h);
				min = Math.min(w, h);
			}
		}
		return max*min;
	}
}
