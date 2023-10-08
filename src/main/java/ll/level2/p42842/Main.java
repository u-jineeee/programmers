package ll.level2.p42842;

public class Main {
}

class Solution {
	public int[] solution(int brown, int yellow) {
		int width = 0;
		int height = 0;
		for (int i = 1; i <= yellow; i++) {
			if (yellow % i == 0) {
				int j = yellow / i;
				if (((j+2)*2)+i*2 == brown) {
					width = j+2;
					height = i+2;
					break;
				}
			}
		}
		return new int[]{width, height};
	}
}
