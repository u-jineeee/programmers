package ll.level1.p161990;

public class Main {
}

class Solution {
	public int[] solution(String[] wallpaper) {
		int lux = 50, luy = 50;
		int rdx = 0, rdy = 0;

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if (wallpaper[i].charAt(j) == '#') {
					if (i < lux) lux = i;
					if (j < luy) luy = j;
					if (i+1 > rdx) rdx = i+1;
					if (j+1 > rdy) rdy = j+1;
				}
			}
		}
		return new int[]{lux, luy, rdx, rdy};
	}
}
