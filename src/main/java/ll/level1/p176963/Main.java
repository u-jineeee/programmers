package ll.level1.p176963;

import java.util.Arrays;
import java.util.List;

public class Main {
}

class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int size = photo.length;
		int[] answer = new int[size];
		List<String> list = Arrays.stream(name).toList();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				int idx = list.indexOf(photo[i][j]);
				if (idx != -1) {
					answer[i] += yearning[idx];
				}
			}
		}
		return answer;
	}
}
