package ll.level1.p77484;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int win_cnt = 0;
		int zero_cnt = 0;

		Arrays.sort(lottos);
		Arrays.sort(win_nums);

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zero_cnt++;
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					win_cnt++;
					break;
				}
			}
		}

		return new int[] {lotto(win_cnt+zero_cnt), lotto(win_cnt)};
	}
	public int lotto(int x) {
		return switch (x) {
			case 6 -> 1;
			case 5 -> 2;
			case 4 -> 3;
			case 3 -> 4;
			case 2 -> 5;
			default -> 6;
		};
	}
}
